public class Main {

    public static void main(String[] args) {
        Podstawowa b1 = new Podstawowa();
            b1.f();
            b1.g();
            System.out.println();

            Pochodna d1 = new Pochodna();
            d1.f(); // w Podstawowa
            d1.g(); // w Pochodna
            d1.h(); // w Pochodna

            Podstawowa b2 = new Pochodna();
            b2.f(); // w Podstawowa
            b2.g(); // w Pochodna

    }
}

