package com.razorthink.java.program3;

import java.util.Scanner;

public class Program3 {
    public Program3() {
    }

    public boolean main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of books ");
        Book b = new Book();
        b.createBooks(sc.nextInt());
        b.showBooks();
        sc.close();
        return true;
    }
}
