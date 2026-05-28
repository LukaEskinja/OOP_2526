package primjeri_abs;

public class Pravokutnik extends GeometrijskiOblik {
    private double a;
    private double b;

    public Pravokutnik(double a, double b) {
        super("Pravokutnik");
        this.a = a;
        this.b = b;
    }

    @Override
    public double povrsina() {
        return a * b;
    }
}
