package org.forritan.talvmenni.ui;

public class TalvMenni {
   public TalvMenni(String args[]) {
      if (args.length > 0
            && args[0].charAt(0) == 'x') {
         XboardMode Xboard= new XboardMode();
         Xboard.create();
      } else {
         ConsoleMode Console= new ConsoleMode();
         Console.create();
      }

   }

   public static void main(String args[]) {
      TalvMenni TalvMenni= new TalvMenni(args);
   }
}