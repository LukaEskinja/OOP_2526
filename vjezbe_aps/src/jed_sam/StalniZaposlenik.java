package jed_sam;

public class StalniZaposlenik extends Zaposlenik {
    private double mjesecnaPlaca;

    public StalniZaposlenik(String ime, String prezime, double mjesecnaPlaca) {
        super(ime, prezime);
        this.mjesecnaPlaca = mjesecnaPlaca;
    }

    @Override
    public double izracunajPlacu() {
        return mjesecnaPlaca;
    }
}
