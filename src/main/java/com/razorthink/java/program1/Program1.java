package com.razorthink.java.program1;

import java.util.Scanner;

public class Program1 {
    public Program1() {
    }

    public boolean main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        for(int i = 0; i < n; i += 2) {
            System.out.println(i + 2 + " ");
        }
        return true;
    }
}
