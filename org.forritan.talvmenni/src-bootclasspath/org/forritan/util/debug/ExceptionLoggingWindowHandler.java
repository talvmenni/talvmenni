/**
 * talvmenni - A distributed chess-engine implemented in Java(TM)
 * and against Sun Microsystems Jini/JavaSpaces(TM).
 *  
 * Copyright (C) 2004-2006 Eyðun Lamhauge and Eyðun Nielsen
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License. 
 */

package org.forritan.util.debug;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.logging.ErrorManager;
import java.util.logging.Filter;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class ExceptionLoggingWindowHandler extends Handler implements UncaughtExceptionHandler {
   
   private static ExceptionLoggingWindow        window;
   private static ExceptionLoggingWindowHandler handler;
   private static Logger logger;

   private ExceptionLoggingWindowHandler() {
      configure();
      window= new ExceptionLoggingWindow(
            "Exception logging window",
            400,
            200);
      if (logger == null) {
         logger = Logger.getLogger("ExceptionLogger");
         logger.addHandler(this);
      }
   }

   public static synchronized ExceptionLoggingWindowHandler getInstance() {
      if (handler == null) {
         handler= new ExceptionLoggingWindowHandler();
      }
      return handler;
   }

   /**
    * Get any configuration properties set
    */
   private void configure() {
      LogManager manager= LogManager.getLogManager();
      String className= getClass().getName();
      String level= manager.getProperty(className
            + ".level");
      setLevel((level == null) ? Level.INFO : Level.parse(level));
      String filter= manager.getProperty(className
            + ".filter");
      setFilter(makeFilter(filter));
      String formatter= manager.getProperty(className
            + ".formatter");
      setFormatter(makeFormatter(formatter));
   }

   private Filter makeFilter(
         String name) {
      Filter f= null;
      try {
         Class c= Class.forName(name);
         f= (Filter) c.newInstance();
      } catch (Exception e) {
         if (name != null) {
            System.err.println("Unable to load filter: "
                  + name);
         }
      }
      return f;
   }

   private Formatter makeFormatter(
         String name) {
      Formatter f= null;
      try {
         Class c= Class.forName(name);
         f= (Formatter) c.newInstance();
      } catch (Exception e) {
         f= new SimpleFormatter();
      }
      return f;
   }

   // Overridden abstract Handler methods

   public void close() {
   }

   public void flush() {
   }

   /**
    * If record is loggable, format it and add it to window
    */
   public void publish(
         LogRecord record) {
      String message= null;
      if (isLoggable(record)) {
         try {
            message= getFormatter().format(
                  record);
         } catch (Exception e) {
            reportError(
                  null,
                  e,
                  ErrorManager.FORMAT_FAILURE);
            return;
         }
         try {
            window.addLogInfo(message);
         } catch (Exception e) {
            reportError(
                  null,
                  e,
                  ErrorManager.WRITE_FAILURE);
         }
      }
   }

   public void uncaughtException(
         Thread t,
         Throwable e) {
      logger.log(Level.WARNING, t.getName(), e);
   }
   
   public static Logger getLogger() {
      if (handler == null) {
         handler= new ExceptionLoggingWindowHandler();
      }
      return logger;
   }
}

