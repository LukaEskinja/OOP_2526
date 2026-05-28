package sloz_zad;

public class PretplataProizvod extends Proizvod {
    private int brojMjeseci;
    private static final double POPUST_GODISNJI = 0.10;

    public PretplataProizvod(String naziv, double mjesecnaCijena, int brojMjeseci) {
        super(naziv, mjesecnaCijena);
        this.brojMjeseci = brojMjeseci;
    }

    @Override
    public double ukupnaCijena() {
        double ukupno = osnovnaCijena * brojMjeseci;
        if (brojMjeseci >= 12) {
            ukupno *= (1 - POPUST_GODISNJI);
        }
        return ukupno;
    }
}
