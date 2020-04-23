public class Punkt3D extends Punkt2D {
    int z;
    Punkt3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    void wypisz3D() {
        System.out.println("Punkt 3D:");
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }
}
