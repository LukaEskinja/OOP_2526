package szs_prk_i_srtz;

public abstract class KnjiznicnaJedinica {
    protected String naslov;
    protected int godina;

    public KnjiznicnaJedinica(String naslov, int godina) {
        this.naslov = naslov;
        this.godina = godina;
    }

    public abstract String podaci();

    @Override
    public String toString() {
        return podaci();
    }
}
