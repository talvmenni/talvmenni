package org.forritan.talvmenni.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import org.forritan.talvmenni.game.ImmutablePosition;

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
      scroller.setPreferredSize (new Dimension (300, 900));
      
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

