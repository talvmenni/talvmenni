package org.forritan.talvmenni.ui;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class OpeningBook {
   static String[] variation;

   public static String loadBook(
         String theFile) {
      String theOutput= "Opening book: "
            + theFile
            + " loaded with success";
      FileReader bookReader= null;
      
      try {
         bookReader= new FileReader(
               theFile);
      } catch (FileNotFoundException e) {
         theOutput= "file not found: "
               + theFile;
      }

      BufferedReader BookBuffer= new BufferedReader(
            bookReader);
      String toRead;
      int counter= 0;
      try {
         while ((toRead= BookBuffer.readLine()) != null) {
            counter++;
            variation[counter] = toRead;
         }
      } catch (IOException e1) {
         theOutput= "Error message:";
         e1.printStackTrace();
      }

      return theOutput;
   }
}