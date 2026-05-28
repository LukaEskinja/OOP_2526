package primjeri_mjerljivo;

public class UdaljenostKm implements Mjerljivo {
    private double km;

    public UdaljenostKm(double km) {
        this.km = km;
    }

    @Override
    public double dajVrijednost() {
        return km;
    }

    @Override
    public String toString() {
        return km + " km";
    }
}
