package com.razorthink.java.program2;

import java.util.Scanner;

public class Program2 {
    public Program2() {
    }

    public boolean main() {

        Rectangle[] r= new Rectangle[3];
       r[0] = new Rectangle(10,12);
        r[1] = new Rectangle(20,10);
        r[2] = new Rectangle(30,11);




        System.out.println("Rectangle\tlength\t\tbreadth\t\tarea\t\tperemeter\n-----------------------------------------------------------");

        for(int i = 0; i < r.length; ++i) {
            System.out.println((i+1)+"\t\t"+r[i].getLength() + "\t\t" + r[i].getBreadth() + "\t\t" + r[i].areaOfRectangle() + "\t\t" + r[i].peremeterOfRectangle());
        }

        return true;
    }


}
