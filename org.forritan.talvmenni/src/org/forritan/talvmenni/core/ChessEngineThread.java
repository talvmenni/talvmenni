package org.forritan.talvmenni.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ChessEngineThread extends Thread {

   private ChessEngineProtocol protocol = null;

   public ChessEngineThread(
         ChessEngineProtocol protocol) {
      this.protocol= protocol;
   }

   public void run() {

      BufferedReader inReader= new BufferedReader(
            new InputStreamReader(
                  System.in));

      String inputMessage= "";

      while (this.protocol.isRunning()) {
         try {
            inputMessage= inReader.readLine();
         } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
         String reply = null;
         if (inputMessage != null) {
            
            reply= this.protocol.processInput(inputMessage);
         }
         if(reply != null) {
            System.out.println(reply);
         }
         inputMessage= null;
         reply= null;
      }
   }
}