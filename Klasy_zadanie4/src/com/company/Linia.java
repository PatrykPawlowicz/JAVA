package com.company;

public class Linia {
    Punkt początek;
    Punkt koniec;

    public Linia(int x, int y, int x2, int y2) {
        początek = new Punkt(x,y);
        koniec = new Punkt(x2,y2);
    }
    public Linia(Punkt a, Punkt b) {
        początek = a;
        koniec = b;
    }

    public Punkt getPoczątek() {
        return początek;
    }

    public void setPoczątek(Punkt początek) {
        this.początek = początek;
    }

    public Punkt getKoniec() {
        return koniec;
    }

    public void setKoniec(Punkt koniec) {
        this.koniec = koniec;
    }
}
