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

package org.forritan.talvmenni.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DebugWindow implements Observer {

   public static JFrame        DebugWindow;
   public static JTextArea     MessageText;
   private final static String newline = "\n";

   /**
    * Create the GUI and show it. For thread safety, this method should be
    * invoked from the event-dispatching thread.
    */
   private static void createAndShowGUI(String name) {
      //Suggest that the L&F (rather than the system)
      //decorate all windows. This must be invoked before
      //creating the JFrame. Native look and feels will
      //ignore this hint.
      
     // JFrame.setDefaultLookAndFeelDecorated(true);

      //Create and set up the window.
      DebugWindow= new JFrame(name);
      DebugWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      MessageText= new JTextArea("");
      MessageText.setLineWrap(true);
      
      JScrollPane scroller = new JScrollPane(MessageText);
      scroller.setPreferredSize (new Dimension (500, 1000));
      
      DebugWindow.getContentPane().add(scroller, BorderLayout.CENTER);
      
      //Display the window.
      DebugWindow.setLocation(0, 0);
      DebugWindow.pack();
      DebugWindow.setVisible(true);

   }

   public DebugWindow(final String name) {
      //Schedule a job for the event-dispatching thread:
      //creating and showing this application's GUI.
      javax.swing.SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            createAndShowGUI(name);
         }
      });
   }

   public void updateText(String message) {

      MessageText.append(message
            + newline);

      //Make sure the new text is visible, even if there
      //was a selection in the text area.
      MessageText.setCaretPosition(MessageText.getDocument().getLength());

   }

   public void update(
         Observable o,
         Object arg) {
      if(arg instanceof String) {
         this.updateText((String)arg);
      }
      
   }

}

