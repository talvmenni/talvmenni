/**
 * talvmenni - A distributed chess-engine implemented in Java(TM)
 * and against Sun Microsystems Jini/JavaSpaces(TM).
 *  
 * Copyright (C) 2004-2006 Ey?un Lamhauge and Ey?un Nielsen
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License. 
 */

package org.forritan.talvmenni.masterworker.example;

import org.forritan.talvmenni.masterworker.generic.Result;
import org.forritan.talvmenni.masterworker.generic.Task;

public class FibonacciTask extends Task {

   private static final long serialVersionUID = 1L;

   public Integer n;
    
    public FibonacciTask() {
    }
    
    public FibonacciTask(int n) {
        this.n = new Integer(n);
    }

    public Result execute() {
        System.out.println(
            "Computing Fibonacci of " + n);
        int num = n.intValue();
        return new FibonacciResult(num, fibonacci(num));
    }
    
    public int fibonacci(int n) {
        int lo = 1;
        int hi = 1;
        
        for (int i = 1; i < n; i++) {
            hi = lo + hi;
            lo = hi - lo;
        }
        return hi;
    }
}
