package jed_sam;

public class Kontakt implements PretvorivoUTekst {
    private String ime;
    private String email;

    public Kontakt(String ime, String email) {
        this.ime = ime;
        this.email = email;
    }

    @Override
    public String uTekst() {
        return ime + " <" + email + ">";
    }
}
