package pckg_model;

public abstract class OsobaSaFakulteta {

    protected String ime;

    protected String prezime;

    public OsobaSaFakulteta(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

}
