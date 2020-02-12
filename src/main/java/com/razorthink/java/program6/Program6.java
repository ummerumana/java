package com.razorthink.java.program6;

public class Program6 {
    public Program6() {
    }

    public boolean main(String[] args) {
        String str = args[0];
        System.out.println("Length of string is " + str.length());
        System.out.println("String in upper case is " + str.toUpperCase());
        String str1 = "";

        for(int i = str.length() - 1; i >= 0; --i) {
            str1 = str1 + str.charAt(i);
        }

        System.out.println("Palindrome : " + str.equals(str1));
        return str.equals(str1);
    }
}
