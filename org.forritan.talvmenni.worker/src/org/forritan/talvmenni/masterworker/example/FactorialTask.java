package org.forritan.talvmenni.masterworker.example;

import org.forritan.talvmenni.masterworker.generic.Result;
import org.forritan.talvmenni.masterworker.generic.Task;

public class FactorialTask extends Task {
    public Integer n;
    
    public FactorialTask() {
    }
    
    public FactorialTask(int n) {
        this.n = new Integer(n);
    }

    public Result execute() {
        System.out.println(
            "Computing Factorial of " + n);
        int num = n.intValue();
        return new FactorialResult(num, factorial(num));
    }
    
    public int factorial(int i) {
        if (i == 0) {
            return 1;
        } else {
            return i * factorial(i - 1);
        }
    }
}
