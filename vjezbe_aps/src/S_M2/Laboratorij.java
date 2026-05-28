package S_M2;

public class Laboratorij implements Ocjenjivo {
    private int brojVjezbi;
    private int bodoviPoVjezbi;

    public Laboratorij(int brojVjezbi, int bodoviPoVjezbi) {
        this.brojVjezbi = brojVjezbi;
        this.bodoviPoVjezbi = bodoviPoVjezbi;
    }

    @Override
    public int bodovi() {
        return brojVjezbi * bodoviPoVjezbi;
    }

    @Override
    public String naziv() {
        return "Laboratorijske vjezbe (" + brojVjezbi + " vjezbi)";
    }
}
