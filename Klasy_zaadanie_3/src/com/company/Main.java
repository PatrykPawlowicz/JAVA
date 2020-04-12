package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	 KoszykProduktów koszyk = new KoszykProduktów();
        koszyk.dodajProduktDoKoszyka("P1");
        koszyk.dodajProduktDoKoszyka("P2");
        koszyk.dodajProduktDoKoszyka("P3");

        koszyk.pokazZamowienie();
    }
    static class KoszykProduktów {
        private LinkedList produkty = new LinkedList();

        private void pokazZamowienie() {
            System.out.println("Zamówione produkty:");
            System.out.println(produkty);
        }

        public void dodajProduktDoKoszyka(String produkt) {
            produkty.add(produkt);
        }
    }
}
