package com.company;

public class Main {

    public static void main(String[] args) {
	rower rower1 = new rower();
	rower rower2 = new rower();
	rower1.start();
	rower2.start();

	rower2.przyspiesz(50);

	rower1.wyswietlStan();
	rower2.wyswietlStan();

	rower2.stop();

	rower2.wyswietlStan();

    }
    static class rower {
        boolean wRuchu;
        int predkosc;


        public void start()

        {
            wRuchu = true;
            predkosc = 0;
        }

        public void stop()

        {
            wRuchu = false;
            predkosc = 0;
        }

        public void przyspiesz(int nowaPredkosc)
        {
            predkosc = nowaPredkosc;
        }
        public void wyswietlStan()
        {
            System.out.println("Obecny stan ");
            System.out.println("Prędkość wynosi " + predkosc);
            System.out.println("Czy rower jest w ruchu? "+ (wRuchu ? "tak":"nie"));

        }
    }



}
