package primjeri_abs_ispisivo;

public class Predmet implements Ispisivo {
    private String naziv;
    private int ects;

    public Predmet(String naziv, int ects) {
        this.naziv = naziv;
        this.ects = ects;
    }

    @Override
    public void ispisi() {
        System.out.println("Predmet: " + naziv + " (" + ects + " ECTS)");
    }
}
