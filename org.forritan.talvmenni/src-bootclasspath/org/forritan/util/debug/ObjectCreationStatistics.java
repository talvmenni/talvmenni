package org.forritan.util.debug;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PipedReader;
import java.io.PrintStream;
import java.util.List;
import java.util.Observable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import org.forritan.talvmenni.game.Position;


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

   public static final Info ResetObjectCreationStats = new Info() {
                                                        public void run() {
                                                           ___resetObjectCreationStats();
                                                        }
                                                     };

   public static final Info PrintObjectCreationStats = new Info() {
                                                        public void run() {

                                                           ThreadFactory threadFactory= Executors
                                                                 .defaultThreadFactory();

                                                           final PipedInputStream pipedInputStream= new PipedInputStream();
                                                                                                                      
                                                           try {
                                                              final PrintStream printStream= new PrintStream(
                                                                    new BufferedOutputStream(
                                                                          new PipedOutputStream(
                                                                                pipedInputStream)));
                                                            threadFactory
                                                              .newThread(new Runnable() {
                                                                 public void run() {
                                                                    ___printObjectCreationStats(printStream);
                                                                    printStream
                                                                          .flush();
                                                                 }
                                                              }).start();
                                                           } catch (IOException e) {
                                                              this.text= "I/O exception in ObjectStatisticsWindow.update(Observable o, Object arg)";
                                                           }

                                                           threadFactory
                                                           .newThread(new Runnable() {
                                                              public void run() {
                                                                 StringBuilder stringBuilder= new StringBuilder();
                                                                 try {
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
                                                           }).start();
                                                           
                                                        }
                                                     };
}