package primjeri_abs;

public class Macka extends Zivotinja {
    public Macka(String ime) {
        super(ime);
    }

    @Override
    public String glasanje() {
        return "Mijau !";
    }
}
