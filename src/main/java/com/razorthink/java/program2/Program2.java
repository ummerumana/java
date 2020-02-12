package com.razorthink.java.program2;

import java.util.Scanner;

public class Program2 {
    public Program2() {
    }

    public double main(int x,int y) {


       Rectangle r = new Rectangle(x,y);


        System.out.println("Rectangle\tlength\t\tbreadth\t\tarea\t\tperemeter\n-----------------------------------------------------------");


            System.out.println((1)+"\t\t"+r.getLength() + "\t\t" + r.getBreadth() + "\t\t" + r.areaOfRectangle() + "\t\t" + r.peremeterOfRectangle());


        return r.areaOfRectangle();
    }


}
