package com.razorthink.java.program12;

public class Program12 {
    public Program12() {
    }

    public boolean main() {
        Complex c1 = new Complex(10.0D, 7.0D);
        Complex c2 = new Complex(3.0D, 4.0D);
        Complex add = Complex.addition(c1, c2);
        Complex sub = Complex.subtraction(c1, c2);
        System.out.println("Addition of    :  " + c1.display() + " & " + c2.display() + " = " + add.display());
        System.out.println("Subtraction of :  " + c1.display() + " & " + c2.display() + " = " + sub.display());
        return true;
    }
}
