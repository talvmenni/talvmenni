package org.forritan.talvmenni.masterworker.generic;

import net.jini.core.entry.Entry;


public class Result implements Entry {
   
   public Result() {
   }

   public static Result getTemplate() {
      return new Result();
   }
}

