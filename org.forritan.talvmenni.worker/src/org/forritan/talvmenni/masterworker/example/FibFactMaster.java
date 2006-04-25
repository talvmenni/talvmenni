/**
 * talvmenni - A distributed chess-engine implemented in Java(TM)
 * and against Sun Microsystems Jini/JavaSpaces(TM).
 *  
 * Copyright (C) 2004-2006 Eyðun Lamhauge and Eyðun Nielsen
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

import java.io.IOException;

import org.forritan.talvmenni.masterworker.generic.Result;

public class FibFactMaster extends org.forritan.talvmenni.masterworker.generic.GenericMaster {

   /**
    * @throws IOException
    * @throws InterruptedException
    */
   public FibFactMaster() throws IOException, InterruptedException {
      super();
   }

   public void generateTasks() {
        for (int i = 0; i < 10; i++) {
            FactorialTask task = new FactorialTask(i);
            try {
               writeTask(task);
            } catch (IOException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            } catch (InterruptedException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
        }
             
        for (int i = 0; i < 10; i++) {
            FibonacciTask task = new FibonacciTask(i);
            try {
               writeTask(task);
            } catch (IOException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            } catch (InterruptedException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
        }
    }
        
    public void collectResults() {
        Result template = Result.getTemplate();
        for (int i = 1; i < 20; i++) {
            Result result= null;
            try {
               result= takeResult(template);
            } catch (IOException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
            if (FactorialResult.class.isInstance(result)) {
                FactorialResult fact = (FactorialResult)result;
                System.out.println("Factorial of " + fact.n + 
                    " is " + fact.factorial);
            } else if (FibonacciResult.class.isInstance(result)) {
                FibonacciResult fib = (FibonacciResult)result;
                System.out.println("Fibonacci of " + 
                    fib.n + " is " + fib.fibonacci);
            } else {
                System.out.println("Result class not found");
            }
        }
    }
    
    public static void main(
         String[] args) throws IOException, InterruptedException {
      System.setProperty("java.security.policy", "policy.all");
      new Thread(new FibFactMaster()).start();
   }
}
