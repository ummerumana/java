package com.razorthink.java.program5;

public class Date {
    private int dd = 17;
    private int mm = 11;
    private int yyyy = 1997;

    public Date(int dd, int mm, int yyyy) {
        if (dd > 0 && dd < 32 && mm > 0 && mm < 13 && yyyy > 1990 && yyyy <= 2020) {
            this.dd = dd;
            this.mm = mm;
            this.yyyy = yyyy;
        } else {
            System.out.println("Enter a valid date");
        }

    }

    public int getDd() {
        return this.dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }

    public int getMm() {
        return this.mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getYyyy() {
        return this.yyyy;
    }

    public void setYyyy(int yyyy) {
        this.yyyy = yyyy;
    }
}
