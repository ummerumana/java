package com.razorthink.java.program10;

import java.util.Scanner;

public class Program10 {
    public boolean main() {
        Term polynomial[] = new Term[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++)
        {
            polynomial[i]=new Term();
            System.out.println("Enter term "+(i+1)+" coefficient and exponent");
            polynomial[i].setTerm(sc.nextInt(), sc.nextInt());
        }
        for (int i = 0; i < polynomial.length-1; i++)
        {
            for (int j = 0; j < polynomial.length-1-i; j++)
            {
                if (polynomial[j].getExponent() < polynomial[j+1].getExponent() )
                {
                    int temp = polynomial[j].getExponent() ;
                    polynomial[j].setExponent(polynomial[j+1].getExponent()) ;
                    polynomial[j+1].setExponent(temp);
                }
            }
        }

        System.out.println("Polynomial is ");
        for(int i=0;i<polynomial.length;i++)
        {
            System.out.print(polynomial[i].getCoefficient()+"x^"+polynomial[i].getExponent()+" + ");
        }
        return true;
    }

}
