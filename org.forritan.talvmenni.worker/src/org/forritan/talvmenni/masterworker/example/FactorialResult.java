package org.forritan.talvmenni.masterworker.example;

import org.forritan.talvmenni.masterworker.generic.Result;

public class FactorialResult extends Result {
    public Integer n;
    public Integer factorial;
    
    public FactorialResult() {
    }
    
    public FactorialResult(int n, int factorial) {
        this.n = new Integer(n);
        this.factorial = new Integer(factorial);
    }
}
