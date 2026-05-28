package jed_sam;

public abstract class Vozilo {
    protected String naziv;

    protected Vozilo(String naziv) {
        this.naziv = naziv;
    }

    public abstract int maxBrzina();

    public void info() {
        System.out.println(naziv + " -> max brzina: " + maxBrzina() + " km/h");
    }
}
