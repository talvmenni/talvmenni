package org.forritan.talvmenni.UI;

import java.io.*;


public class XboardMode {

   private boolean isRunning;

   public XboardMode() {
      isRunning= true;
   }

   public void create() {

      BufferedReader inReader= new BufferedReader(new InputStreamReader(
            System.in));

      String xboardMessage= "";
      System.out.println("feature myname=\"TALVMENNI v0.1\" done=1");

      while (this.isRunning) {
         try {
            xboardMessage= inReader.readLine();
         } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }

         if (xboardMessage.equals("d2d4")) {
            System.out.println("move d7d5");
         }
         if (xboardMessage.equals("e2e4")) {
            System.out.println("move c7c5");
         }

      }

   }

}