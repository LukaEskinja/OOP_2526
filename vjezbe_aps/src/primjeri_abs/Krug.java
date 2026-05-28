package primjeri_abs;

public class Krug extends GeometrijskiOblik {
    private double polumjer;

    public Krug(double polumjer) {
        super("Krug");
        this.polumjer = polumjer;
    }

    @Override
    public double povrsina() {
        return Math.PI * polumjer * polumjer;
    }
}
