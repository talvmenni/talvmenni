package org.forritan.talvmenni.core;

import java.util.ArrayList;

public class TalvMenni {
   
   public static final boolean CROUCHING_TIGER_HIDDEN_DEBUG = false; // ...or just till the f***ing eclipse debugger gets up to speed... ;-)
   public static final boolean DEBUG_WINDOW = false;

   public static void main(
         String args[]) {
      ChessEngine chessEngine= ChessEngine.create();
      chessEngine.run();
   }
   
   private String[] splitArgs(String[] args, String[] regExps) {
      String[] result= args;
      for (int i= 0; i < regExps.length; i++) {
         result= this.splitArg(result, regExps[i]);
      }
      return result;
   }

   private String[] splitArg(String[] args, String regExp) {
      ArrayList result= new ArrayList();
      for (int i= 0; i < args.length; i++) {
         String[] s= args[i].split(regExp);
         if (s[0].length() > 0) {
            result.add(s[0]);
         }
         for (int j= 1; j < s.length; j++) {
            if (s[j].length() > 0) {
               result.add(regExp.concat(s[j]));
            }
         }
      }
      return (String[]) result.toArray(new String[] {
      });
   }

}