package org.forritan.talvmenni.ui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


/* FrameDemo.java requires no other files. */
public class DebugWindow {

   public static JFrame        vindeyga;
   public static JTextArea     tekstur;
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
      JFrame.setDefaultLookAndFeelDecorated(true);

      //Create and set up the window.
      vindeyga= new JFrame("Talvmenni JFrame");
      vindeyga.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      tekstur= new JTextArea("");
      tekstur.setPreferredSize(new Dimension(300, 300));
      vindeyga.getContentPane().add(tekstur, BorderLayout.CENTER);

      //Display the window.
      vindeyga.setLocation(650, 50);
      vindeyga.pack();
      vindeyga.setVisible(true);

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

   /**
    * @param string
    */
   public static void updateTekst(String message) {

      tekstur.append(message
            + newline);

      //Make sure the new text is visible, even if there
      //was a selection in the text area.
      tekstur.setCaretPosition(tekstur.getDocument().getLength());

   }

}

