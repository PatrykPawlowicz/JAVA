public class Main {

    public static void main(String[] args) {
        Kalkulator kalkulator_podstawowy = new Kalkulator();
        System.out.println("Kalkulator Podstawowy");
        System.out.println(kalkulator_podstawowy.dodaj(10.0,20.0));
        System.out.println(kalkulator_podstawowy.odejmij(10.0,20.0));
        System.out.println();

        Kalkulator_naukowy kalkulator_naukowy = new Kalkulator_naukowy();
        System.out.println("Kalkulator Naukowy: ");
        System.out.println(kalkulator_naukowy.dodaj(10.0,20.0));
        System.out.println(kalkulator_naukowy.odejmij(10.0,20.0));
        kalkulator_naukowy.sinus(10.0);
    }

}
