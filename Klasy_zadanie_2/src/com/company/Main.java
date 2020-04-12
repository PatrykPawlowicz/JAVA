package com.company;

import java.awt.desktop.SystemSleepEvent;

public class Main {

    public static void main(String[] args) {
	kontoBankowe ekonto = new kontoBankowe();
	ekonto.pokazSaldo();
	ekonto.kredyt(100);
	ekonto.pokazSaldo();
	ekonto.debet(50);
	ekonto.pokazSaldo();
    }
    static class kontoBankowe{
        private int saldo = 0;
        public void pokazSaldo() {
            System.out.println("Obecne saldo wynosi "+saldo+ " zł");
        }
        public void kredyt(int ilość){
            System.out.println("Kredyt = " + (saldo += ilość));

        }
        public void debet(int ilość){
            System.out.println("Debet "+ (saldo -= ilość));
        }
    }
}
