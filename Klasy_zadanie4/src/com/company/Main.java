package com.company;

public class Main {

    public static void main(String[] args) {
        Punkt p1 = new Punkt(10,20);
        System.out.println(p1.toString());
        Linia l1 = new Linia(1,2,3,4);
        System.out.println(l1.toString());
        Punkt p2 = new Punkt(11,21);
        Punkt p3 = new Punkt(12,22);
        Linia l2 = new Linia(p2,p3);
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(l2.toString());
    }
    }