package org.forritan.talvmenni.masterworker.generic;

import net.jini.core.entry.Entry;

public class Task implements Entry, Command {
   
   public Task() {
   }
   
    public Result execute() {
        throw new RuntimeException(
            "Task.execute() not implemented");
    }
}
