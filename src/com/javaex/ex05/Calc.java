package com.javaex.ex05;

public abstract class Calc {
    protected int a,b;
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public abstract int calculate();
}
