package org.forritan.talvmenni.ui;

public class TalvMenni {

   public static void main(String args[]) {
      if (args.length > 0
            && args[0].equalsIgnoreCase("x")) {
         XboardMode xBoard= new XboardMode();
         xBoard.create();
      } else {
         ConsoleMode console= new ConsoleMode();
         console.create();
      }
   }
}