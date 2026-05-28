package primjeri_abs;

public class Pas extends Zivotinja {
    public Pas(String ime) {
        super(ime);
    }

    @Override
    public String glasanje() {
        return "Vau !";
    }
}