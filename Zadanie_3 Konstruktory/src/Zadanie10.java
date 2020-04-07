public class Zadanie10 {
    int wartoscPrzykładowa1, wartoscPrzykładowa2;

    public Zadanie10(int wartoscPrzykładowa1) {
        this.wartoscPrzykładowa1 = wartoscPrzykładowa1;
    }

    public Zadanie10(int wartoscPrzykładowa1, int wartoscPrzykładowa2) {
        this.wartoscPrzykładowa1 = wartoscPrzykładowa1;
        this.wartoscPrzykładowa2 = wartoscPrzykładowa2;
    }

    public Zadanie10() {
    }

    public int wykonajOperacjeMatematycznaDodawanie() {
        return wartoscPrzykładowa1 + wartoscPrzykładowa2;
    }

    public int wykonajOperacjeMatematycznaDodawanie(int wartoscPrzykładowa3) {
        return wartoscPrzykładowa1 + wartoscPrzykładowa2;

    }

    public int wykonajOperacjeMatematycznaMnozenie(int wartoscPrzykładowa4, int wartoscPrzykładowa5) {
        return wartoscPrzykładowa1 * wartoscPrzykładowa2 * wartoscPrzykładowa4 * wartoscPrzykładowa5;
    }

}
