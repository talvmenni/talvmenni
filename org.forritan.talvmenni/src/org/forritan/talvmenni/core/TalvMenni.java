package org.forritan.talvmenni.core;

import java.util.ArrayList;

public class TalvMenni {
   
   public static boolean TELLUSER_ALL_INPUT;
   public static final boolean DEBUG_WINDOW= false;
   public final static String NAME= "Talvmenni";
   public final static String VERSION= "Version 0.1";
   public static String DEBUG_NAME;
   

   public static void main(
         String args[]) {
      TELLUSER_ALL_INPUT= Boolean.getBoolean("org.forritan.talvmenni.telluser_all_input");
      DEBUG_NAME= System.getProperty("org.forritan.talvmenni.debug_name");      
      ChessEngine chessEngine= ChessEngine.create();
      chessEngine.run();
   }
   
   private String[] splitArgs(String[] args, String[] regExps) {
      String[] result= args;
      for(String regExp : regExps) {
         result= this.splitArg(result, regExp);
      }
      return result;
   }

   private String[] splitArg(String[] args, String regExp) {
      ArrayList<String> result= new ArrayList<String>();
      for (String arg : args) {
         String[] s= arg.split(regExp);
         if (s[0].length() > 0) {
            result.add(s[0]);
         }
         for (int j= 1; j < s.length; j++) {
            if (s[j].length() > 0) {
               result.add(regExp.concat(s[j]));
            }
         }
      }
      return result.toArray(new String[] {});
   }

}