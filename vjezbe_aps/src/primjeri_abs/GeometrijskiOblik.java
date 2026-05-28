package primjeri_abs;

public abstract class GeometrijskiOblik {
    protected String naziv;

    protected GeometrijskiOblik(String naziv) {
        this.naziv = naziv;
    }

    public abstract double povrsina();

    public String opis() {
        return naziv + ", povrsina = " + String.format("%.2f", povrsina());
    }
}
