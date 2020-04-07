public class PrzykladDwa {
    private double prawdziwy;
    private double wyimaginowany;

    public void wypisz() {
        String x = "Prawdziwy: " + Double.toString(prawdziwy);
        System.out.println(x);
        String x2 = "Wyimaginowany: " + Double.toString(wyimaginowany);
        System.out.println(x2);
    }

    PrzykladDwa() {
        prawdziwy = 0;
        wyimaginowany = 0;
    }

    PrzykladDwa(double prawdziwy) {
        this.prawdziwy = prawdziwy;
    }

    PrzykladDwa(double prawdziwy, double wyimaginowany) {
        this.prawdziwy = prawdziwy;
        this.wyimaginowany = wyimaginowany;
    }

}
