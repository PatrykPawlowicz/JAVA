import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Ksztalt> ksztalty = new ArrayList<>();
        ksztalty.add(new Kolo(5));
        ksztalty.add(new Kwadrat(5));
	for (Ksztalt s : ksztalty) {
        System.out.println("Powierzchnia ksztaltu wynosi: " + s.obliczPowierzchnie());
    }
    }
}
interface Ksztalt{
    double obliczPowierzchnie();
    double obliczObwód();
}
class Kwadrat implements Ksztalt{
    double dlugoscBoku;
    public Kwadrat(double dlugoscBoku){
        this.dlugoscBoku = dlugoscBoku;
    }
    public double obliczObwód(){
        return dlugoscBoku * 4;
    }
    public double obliczPowierzchnie(){
        return dlugoscBoku * dlugoscBoku;
    }
}
class Kolo implements Ksztalt{
double promien;
public Kolo(double promien){
    this.promien=promien;
}
public double obliczObwód(){
    return Math.PI*promien*4;
}
public double obliczPowierzchnie(){
    return Math.PI*promien*promien;
}
}