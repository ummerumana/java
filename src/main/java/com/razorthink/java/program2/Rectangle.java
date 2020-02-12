package com.razorthink.java.program2;

public class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        try {
            if (length < 0.0D || length > 20.0D) {
                throw new RuntimeException("Enter a valid length");
            }

            this.length = length;
        } catch (Exception var4) {
            System.out.println(var4.getMessage());
        }

    }

    public double getBreadth() {
        return this.breadth;
    }

    public void setBreadth(double breadth) {
        try {
            if (breadth < 0.0D || breadth > 20.0D) {
                throw new RuntimeException("Enter a valid breadth");
            }

            this.breadth = breadth;
        } catch (Exception var4) {
            System.out.println(var4.getMessage());
        }

    }

    public double areaOfRectangle() {
        return this.length * this.breadth;
    }

    public double peremeterOfRectangle() {
        return 2.0D * (this.length + this.breadth);
    }
}
