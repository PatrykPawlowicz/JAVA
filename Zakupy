import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Mini zakupy");
        Produkt p = new Produkt();
        p.dodajProdukt();
    }
    static class Produkt {
        int a = 0;
        String plus = "+";
        String minus = "-";
        String pokazKoszyk = "Pokaż koszyk";
        String ziz = "Zakończ i zapłać";
        String sp;
        String karta = "kartą";
        String odbior = "przy odbiorze";
        String danekarty;
        String wysylka;

        public void dodajProdukt() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Aby dodać nowy produkt do koszyka wpisz +, aby usunąc jeden produkt z koszyka wpisz - ");
            String wart = scan.nextLine();
                if (wart.equals(plus)) {
                    a = a + 1;
                    System.out.println("Dodano nowy produkt do koszyka");
                    sprawdzKoszyk();
                } else if (wart.equals(minus)) {
                    if(a>=1) {
                    a = a - 1;
                    System.out.println("Usunięto jeden produkt z koszyka");
                    sprawdzKoszyk();}
                    else{
                        System.out.println("Koszyk jest pusty, nie możesz usunąc żadnego produktu.");
                        dodajProdukt();}}
                    else {
                    System.out.println("Podaj właściwą wartość");
                    dodajProdukt();
                }

        }

        void sprawdzKoszyk() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Aby sprawdzić koszyk wpisz; 'Pokaż koszyk' , 'Modyfikuj koszyk' lub 'Zakończ i zapłać' ");
            String koszyk = scan.nextLine();
            if (koszyk.equals(pokazKoszyk)){
                Koszyk();
            }
                else if(koszyk.equals(ziz)){
                    Ziz();
            }
                else {
                dodajProdukt();
            }
        }

        void Koszyk() {
            System.out.println("W Twoim koszyku znajduje się: " + a + " produkt/ów");
            sprawdzKoszyk();
        }
        void Ziz(){
            System.out.println("Wybierz sposób płatności:(wpisz 'kartą' lub 'przy odbiorze') ");
            Scanner scan = new Scanner(System.in);
            String sp = scan.nextLine();
            if(sp.equals(karta)) {
                System.out.println("Podaj dane karty: ");
                Scanner scan2 = new Scanner(System.in);
                String danekarty = scan.nextLine();
                System.out.println(" Dziękujemy za zakupy! ");
            }
            else if(sp.equals(odbior)){
                System.out.println("Podaj dane do wysyłki:");
                Scanner scan3 = new Scanner(System.in);
                String wysylka = scan.nextLine();
                System.out.println(" Dziękujemy za zakupy! ");


            }
            else{
                System.out.println("Podaj właściwą wartość");
                Ziz();
            }

        }
    }
}
