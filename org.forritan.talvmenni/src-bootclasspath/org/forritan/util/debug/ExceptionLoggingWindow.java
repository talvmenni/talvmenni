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

