package org.forritan.talvmenni.masterworker.example;

import org.forritan.talvmenni.masterworker.generic.Result;
import org.forritan.talvmenni.masterworker.generic.Task;

public class FibonacciTask extends Task {
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
