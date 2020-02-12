package com.razorthink.java.program2;

import java.util.Scanner;

public class Program2 {
    public Program2() {
    }

    public boolean main() {
        Scanner sc = new Scanner(System.in);
        int i = 0;

        Rectangle[] r;
        for(r = new Rectangle[3]; i < 3; r[i++] = new Rectangle(sc.nextDouble(), sc.nextDouble())) {
            System.out.println("Enter rectangle " + (i + 1) + " length and breadth");
        }

        System.out.println("Rectangle\tlength\t\tbreadth\t\tarea\t\tperemeter\n-----------------------------------------------------------");

        for(i = 0; i < r.length; ++i) {
            System.out.println(r[i].getLength() + "\t\t" + r[i].getBreadth() + "\t\t" + r[i].areaOfRectangle() + "\t\t" + r[i].peremeterOfRectangle());
        }

        return true;
    }

}
