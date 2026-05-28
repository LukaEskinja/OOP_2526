package primjeri_mjerljivo;

public class Temperatura implements Mjerljivo {
    private double stupnjevi;

    public Temperatura(double stupnjevi) {
        this.stupnjevi = stupnjevi;
    }

    @Override
    public double dajVrijednost() {
        return stupnjevi;
    }

    @Override
    public String toString() {
        return stupnjevi + " C";
    }
}
