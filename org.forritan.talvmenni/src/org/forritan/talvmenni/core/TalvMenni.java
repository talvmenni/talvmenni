package org.forritan.talvmenni.core;

import org.forritan.talvmenni.ui.ConsoleProtocol;
import org.forritan.talvmenni.ui.XboardProtocol;

public class TalvMenni {

   public static void main(String args[]) {
      if (args.length > 0
            && args[0].equalsIgnoreCase("x")) {
         XboardProtocol xBoard= new XboardProtocol();
         xBoard.run();
      } else {
         ConsoleProtocol console= new ConsoleProtocol();
         console.run();
      }
   }
}