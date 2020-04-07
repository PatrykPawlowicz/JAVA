public class Main {

    public static void main(String[] args) {
        Zadanie10 p1 = new Zadanie10(16);
        Zadanie10 p2 = new Zadanie10(79, 1);


        System.out.println(p1.wykonajOperacjeMatematycznaDodawanie());
        System.out.println(p1.wykonajOperacjeMatematycznaMnozenie(5, 4));

        System.out.println(p2.wykonajOperacjeMatematycznaDodawanie(9));
        System.out.println(p2.wykonajOperacjeMatematycznaMnozenie(3, 6));
    }
}
