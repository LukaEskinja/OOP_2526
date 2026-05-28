package S_M2;

public class Ispit implements Ocjenjivo {
    private String nazivIspita;
    private int ostvareniBodovi;

    public Ispit(String nazivIspita, int ostvareniBodovi) {
        this.nazivIspita = nazivIspita;
        this.ostvareniBodovi = ostvareniBodovi;
    }

    @Override
    public int bodovi() {
        return ostvareniBodovi;
    }

    @Override
    public String naziv() {
        return "Ispit: " + nazivIspita;
    }
}
