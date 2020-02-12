package com.razorthink.java.program3;

import java.util.ArrayList;
import java.util.Scanner;

public class Program3 {

    ArrayList<Book> books = new ArrayList<Book>();

    public boolean main() {

        createBooks();
        showBooks();
        return true;
    }
    public void createBooks() {
            books.add(new Book("Java",320.25));
            books.add(new Book("Python",510.70));
            books.add(new Book("C++",185.50));

    }

    public void showBooks() {
            System.out.println("BookTitle     Price\n--------------------------");
            for (int i = 0; i < books.size(); i++) {
                System.out.println(books.get(i).getTitle() + " \t  " + books.get(i).getPrice());
            }
    }

}
