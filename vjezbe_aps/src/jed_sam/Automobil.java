package jed_sam;

public class Automobil extends Vozilo {
    public Automobil() {
        super("Automobil");
    }

    @Override
    public int maxBrzina() {
        return 200;
    }
}
