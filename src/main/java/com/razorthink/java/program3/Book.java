package com.razorthink.java.program3;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    private String title;
    private double price;
    Scanner sc = new Scanner(System.in);
    ArrayList<Book> books = new ArrayList<Book>();

    public Book() {

    }

    public Book(String title, double price) {
        super();
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void createBooks(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Enter title and price");
            books.add(new Book(sc.next(), sc.nextDouble()));
        }
    }

    public void showBooks() {
        System.out.println("BookTitle     Price");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getTitle() + " \t  " + books.get(i).getPrice());
        }
    }
}
