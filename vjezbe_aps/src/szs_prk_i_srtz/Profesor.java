package szs_prk_i_srtz;

public class Profesor extends Osoba {
    private String zvanje;
    private int brojRadova;

    public Profesor(String ime, String prezime, String oib, String zvanje, int brojRadova) {
        super(ime, prezime, oib);
        this.zvanje = zvanje;
        this.brojRadova = brojRadova;
    }

    @Override
    public String uloga() {
        return "Profesor (zvanje: " + zvanje + ", radova: " + brojRadova + ")";
    }
}