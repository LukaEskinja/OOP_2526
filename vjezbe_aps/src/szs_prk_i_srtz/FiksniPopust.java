package szs_prk_i_srtz;

public class FiksniPopust implements Popust {
    private double iznos;

    public FiksniPopust(double iznos) {
        this.iznos = iznos;
    }

    @Override
    public double primijeni(double cijena) {
        double rezultat = cijena - iznos;
        return rezultat > 0 ? rezultat : 0;
    }

    @Override
    public String toString() {
        return "Popust: fiksno " + iznos + " EUR";
    }
}
