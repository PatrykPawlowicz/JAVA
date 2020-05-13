public class Main {

    public static void main(String[] args) {
        rysujUtil(30, 30, 40, 40, new Linia());
        rysujUtil(50, 50, 60, 60, new Prostokat());

    }
    static void rysujUtil(int X1, int Y1, int X2, int Y2,Grafika g){
       g.setPoczatek(X1, Y1);
       g.setKoniec(X2, Y2);
       g.Rysuj();
    }
}
abstract class Grafika {
    protected int X1, Y1;
    protected int X2, Y2;

    public void setPoczatek(int x, int y) {
        X1 = x;
        Y1 = y;
    }

    public void setKoniec(int x, int y) {
        X2 = x;
        Y2 = y;
    }

    public abstract void Rysuj();
}
    class Linia extends Grafika {
        @Override
       public void Rysuj(){
            System.out.printf("Rysuj Linie od (%d, %d) do (%d, %d) %n", X1, Y1, X2, Y2 );
        }
    }
    class Prostokat extends Grafika {
        public void Rysuj(){
            System.out.printf("Rysuj Prostokąt od (%d, %d) do (%d, %d) %n", X1, Y1, X2, Y2 );
    }
}