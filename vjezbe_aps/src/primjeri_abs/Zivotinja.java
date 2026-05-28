package primjeri_abs;

public abstract class Zivotinja {
    protected String ime;

    protected Zivotinja(String ime) {
        this.ime = ime;
    }

    public abstract String glasanje();

    public void predstaviSe() {
        System.out.println("Ja sam " + ime + ". " + glasanje());
    }
}
