package org.forritan.talvmenni.masterworker.example;

import org.forritan.talvmenni.masterworker.generic.Result;

public class FibonacciResult extends Result {
    public Integer n;
    public Integer fibonacci;
    
    public FibonacciResult() {
    }
    
    public FibonacciResult(int n, int fibonacci) {
        this.n = new Integer(n);
        this.fibonacci = new Integer(fibonacci);
    }
}
