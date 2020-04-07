package com.company;

public class Przyklad {
    private int wartosc;

    public void wypisz() {
        String x = "wartość: " + Integer.toString(wartosc);
        System.out.println(x);
    }

    Przyklad() {
        wartosc = 10;
    }

    Przyklad(int wartosc) {
        this.wartosc = wartosc;
    }
}
