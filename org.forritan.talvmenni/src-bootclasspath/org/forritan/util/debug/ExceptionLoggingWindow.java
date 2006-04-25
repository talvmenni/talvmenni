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

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class ExceptionLoggingWindow extends JFrame {
   private static final long serialVersionUID = 1L;
   private JTextArea textArea;

   public ExceptionLoggingWindow(
         String title,
         final int width,
         final int height) {
      super(
            title);
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            setSize(
                  width,
                  height);
            textArea= new JTextArea();
            JScrollPane pane= new JScrollPane(
                  textArea);
            textArea.setEditable(false);
            getContentPane().add(
                  pane);
            setVisible(true);
         }
      });
   }

   public void addLogInfo(
         final String data) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            textArea.append(data);
         }
      });
   }
}

