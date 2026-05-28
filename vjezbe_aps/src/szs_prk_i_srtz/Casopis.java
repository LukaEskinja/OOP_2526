package szs_prk_i_srtz;

public class Casopis extends KnjiznicnaJedinica {
    private int izdanje;
    private String urednik;

    public Casopis(String naslov, int godina, int izdanje, String urednik) {
        super(naslov, godina);
        this.izdanje = izdanje;
        this.urednik = urednik;
    }

    @Override
    public String podaci() {
        return "[ Casopis ] " + naslov + " (" + godina
                + "), izdanje: " + izdanje
                + ", urednik: " + urednik;
    }
}
