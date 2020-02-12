package com.razorthink.java.program12;

public class Complex {
    private double real;
    private double imaginary;

    public int getReal() {
        return (int)this.real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public int getImaginary() {
        return (int)this.imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public String display() {
        return this.getReal() + "+" + this.getImaginary() + "i";
    }

    public static Complex addition(Complex c1, Complex c2) {
        return new Complex(c1.real + c2.real, c1.imaginary + c2.imaginary);
    }

    public static Complex subtraction(Complex c1, Complex c2) {
        return new Complex(c1.real - c2.real, c1.imaginary - c2.imaginary);
    }
}
