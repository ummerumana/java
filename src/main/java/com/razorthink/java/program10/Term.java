package com.razorthink.java.program10;

public class Term {
    private int coefficient;
    private int exponent;

    public Term() {
    }

    public void setTerm(int c, int e) {
        this.coefficient = c;
        this.exponent = e;
    }

    public int getCoefficient() {
        return this.coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public int getExponent() {
        return this.exponent;
    }

    public void setExponent(int exponent) {
        this.exponent = exponent;
    }
}
