
package com.sls.interview;

public class Box<T,P> {

    private T t; // T stands for "Type"
    private P p;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
    
    public void setP(P P) {
        this.p = P;
    }

    public P getP() {
        return p;
    }

}