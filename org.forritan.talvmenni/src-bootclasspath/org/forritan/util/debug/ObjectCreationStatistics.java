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

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.util.Observable;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;


public class ObjectCreationStatistics extends Observable {

   public void post(
         Object obj) {
      this.setChanged();
      this.notifyObservers(obj);
   }

   public static abstract class Info implements Runnable {

      protected String text = null;

      public String getText() {
         return this.text;
      }
   };

   public static final Info ResetObjectCreationStats             = new Info() {
                                                                    public void run() {
                                                                       ___resetObjectCreationStats();
                                                                    }
                                                                 };

   public static final Info PrintObjectCreationStats             = new Info() {
                                                                    public void run() {

                                                                       final CyclicBarrier barrier= new CyclicBarrier(
                                                                             2);

                                                                       ThreadFactory threadFactory= Executors
                                                                             .defaultThreadFactory();

                                                                       final PipedInputStream pipedInputStream= new PipedInputStream();

                                                                       try {
                                                                          final PrintStream printStream= new PrintStream(
                                                                                new BufferedOutputStream(
                                                                                      new PipedOutputStream(
                                                                                            pipedInputStream)));

                                                                          threadFactory
                                                                                .newThread(
                                                                                      new Runnable() {
                                                                                         public void run() {
                                                                                            ___printObjectCreationStats(printStream);
                                                                                            printStream
                                                                                                  .flush();
                                                                                            try {
                                                                                               barrier
                                                                                                     .await();
                                                                                            } catch (InterruptedException ex) {
                                                                                               return;
                                                                                            } catch (BrokenBarrierException ex) {
                                                                                               return;
                                                                                            }
                                                                                         }
                                                                                      })
                                                                                .start();
                                                                       } catch (IOException e) {
                                                                          PrintObjectCreationStats.text= "I/O exception in ObjectStatisticsWindow.update(Observable o, Object arg)";
                                                                       }

                                                                       threadFactory
                                                                             .newThread(
                                                                                   new Runnable() {
                                                                                      public void run() {
                                                                                         try {
                                                                                            StringBuilder stringBuilder= new StringBuilder();
                                                                                            while (pipedInputStream
                                                                                                  .available() != 0) {
                                                                                               stringBuilder
                                                                                                     .append((char) pipedInputStream
                                                                                                           .read());
                                                                                            }
                                                                                            PrintObjectCreationStats.text= stringBuilder
                                                                                                  .toString();
                                                                                         } catch (IOException e) {
                                                                                            PrintObjectCreationStats.text= "I/O exception in ObjectStatisticsWindow.update(Observable o, Object arg)";
                                                                                         }
                                                                                      }
                                                                                   })
                                                                             .start();

                                                                       try {
                                                                          barrier
                                                                                .await();
                                                                       } catch (InterruptedException ex) {
                                                                          return;
                                                                       } catch (BrokenBarrierException ex) {
                                                                          return;
                                                                       }
                                                                    }
                                                                 };

   public static final Info PrintObjectCreationSinceVMStartStats = new Info() {
                                                                    public void run() {

                                                                       final CyclicBarrier barrier= new CyclicBarrier(
                                                                             2);

                                                                       ThreadFactory threadFactory= Executors
                                                                             .defaultThreadFactory();

                                                                       final PipedInputStream pipedInputStream= new PipedInputStream();

                                                                       try {
                                                                          final PrintStream printStream= new PrintStream(
                                                                                new BufferedOutputStream(
                                                                                      new PipedOutputStream(
                                                                                            pipedInputStream)));

                                                                          threadFactory
                                                                                .newThread(
                                                                                      new Runnable() {
                                                                                         public void run() {
                                                                                            ___printObjectCreationSinceVMStartStats(printStream);
                                                                                            printStream
                                                                                                  .flush();
                                                                                            try {
                                                                                               barrier
                                                                                                     .await();
                                                                                            } catch (InterruptedException ex) {
                                                                                               return;
                                                                                            } catch (BrokenBarrierException ex) {
                                                                                               return;
                                                                                            }
                                                                                         }
                                                                                      })
                                                                                .start();
                                                                       } catch (IOException e) {
                                                                          PrintObjectCreationStats.text= "I/O exception in ObjectStatisticsWindow.update(Observable o, Object arg)";
                                                                       }

                                                                       threadFactory
                                                                             .newThread(
                                                                                   new Runnable() {
                                                                                      public void run() {
                                                                                         try {
                                                                                            StringBuilder stringBuilder= new StringBuilder();
                                                                                            while (pipedInputStream
                                                                                                  .available() != 0) {
                                                                                               stringBuilder
                                                                                                     .append((char) pipedInputStream
                                                                                                           .read());
                                                                                            }
                                                                                            PrintObjectCreationSinceVMStartStats.text= stringBuilder
                                                                                                  .toString();
                                                                                         } catch (IOException e) {
                                                                                            PrintObjectCreationSinceVMStartStats.text= "I/O exception in ObjectStatisticsWindow.update(Observable o, Object arg)";
                                                                                         }
                                                                                      }
                                                                                   })
                                                                             .start();

                                                                       try {
                                                                          barrier
                                                                                .await();
                                                                       } catch (InterruptedException ex) {
                                                                          return;
                                                                       } catch (BrokenBarrierException ex) {
                                                                          return;
                                                                       }
                                                                    }
                                                                 };

}