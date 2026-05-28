package sloz_zad;

public class DigitalniProizvod extends Proizvod {
    private static final double POREZ = 0.25;

    public DigitalniProizvod(String naziv, double cijena) {
        super(naziv, cijena);
    }

    @Override
    public double ukupnaCijena() {
        return osnovnaCijena * (1 + POREZ);
    }
}