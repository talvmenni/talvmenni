package org.forritan.talvmenni.ui;

import java.awt.*;
import javax.swing.*;

public class DebugWindow {

   public static JFrame        DebugWindow;
   public static JTextArea     MessageText;
   private final static String newline = "\n";

   /**
    * Create the GUI and show it. For thread safety, this method should be
    * invoked from the event-dispatching thread.
    */
   private static void createAndShowGUI() {
      //Suggest that the L&F (rather than the system)
      //decorate all windows. This must be invoked before
      //creating the JFrame. Native look and feels will
      //ignore this hint.
      
     // JFrame.setDefaultLookAndFeelDecorated(true);

      //Create and set up the window.
      DebugWindow= new JFrame("Talvmenni JFrame");
      DebugWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      MessageText= new JTextArea("");
      MessageText.setLineWrap(true);
      
      JScrollPane scroller = new JScrollPane(MessageText);
      scroller.setPreferredSize (new Dimension (400, 300));
      
      DebugWindow.getContentPane().add(scroller, BorderLayout.CENTER);
      
      //Display the window.
      DebugWindow.setLocation(650, 50);
      DebugWindow.pack();
      DebugWindow.setVisible(true);

   }

   public DebugWindow() {
      //Schedule a job for the event-dispatching thread:
      //creating and showing this application's GUI.
      javax.swing.SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            createAndShowGUI();
         }
      });
   }

   public static void updateTekst(String message) {

      MessageText.append(message
            + newline);

      //Make sure the new text is visible, even if there
      //was a selection in the text area.
      MessageText.setCaretPosition(MessageText.getDocument().getLength());

   }

}

