public class Main {

    public static void main(String[] args) {
        MojKalkulator mojKalkulator = new MojKalkulator();

        System.out.println(mojKalkulator.dodaj(10,20));
        System.out.println(mojKalkulator.odejmij(10,20));
        System.out.println(mojKalkulator.sinus(120));

        Kalkulator nowyKalkulator = new MojKalkulator();

        System.out.println(nowyKalkulator.dodaj(10,20));
        System.out.println(nowyKalkulator.odejmij(10,20));

    }
}
interface Kalkulator {
   double dodaj( double a, double b);
   double odejmij(double a, double b);
       double PI = 3.14159;
}
class MojKalkulator implements Kalkulator{
    public double sinus(double x){
        double radians = x * PI /180;
        return Math.sin(radians);
    }
    public double odejmij(double a, double b){
        return a-b;
    }
    public double dodaj(double a, double b){
        return a+b;
    }
}
