package com.razorthink.java.program5;

import java.util.ArrayList;
import java.util.Scanner;

public class Program5 {
    public Program5() {
    }

    public boolean main() {
        ArrayList<Employee> emp = new ArrayList();
        System.out.println("enter number of employee");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i;
        for(i = 0; i < n; ++i) {
            System.out.println("Employee " + (i + 1));
            System.out.println("Id");
            int eId = sc.nextInt();
            sc.nextLine();
            System.out.println("name");
            String eName = sc.nextLine();
            System.out.println("joining:\ndate");
            int d = sc.nextInt();
            System.out.println("month");
            int m = sc.nextInt();
            System.out.println("year");
            int y = sc.nextInt();
            emp.add(new Employee((long)eId, eName, d, m, y));
        }

        System.out.println("Employee details are :\n-----------------------------------------------");
        System.out.println("Id\tName\tJoining\n----------------------------------------------");

        for(i = 0; i < emp.size(); ++i) {
            System.out.println(((Employee)emp.get(i)).geteId() + "\t" + ((Employee)emp.get(i)).geteName() + "\t" + ((Employee)emp.get(i)).getDate());
        }
        return true;
    }
}
