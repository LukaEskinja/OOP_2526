package sloz_zad;

public abstract class Proizvod {
    protected String naziv;
    protected double osnovnaCijena;

    public Proizvod(String naziv, double osnovnaCijena) {
        this.naziv = naziv;
        this.osnovnaCijena = osnovnaCijena;
    }

    public abstract double ukupnaCijena();

    @Override
    public String toString() {
        return naziv + " -> " + String.format("%.2f", ukupnaCijena()) + " EUR";
    }
}