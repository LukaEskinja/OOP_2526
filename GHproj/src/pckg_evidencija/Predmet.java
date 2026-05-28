package pckg_evidencija;

public abstract class Predmet {

    protected String naziv;

    protected int ECTS;

    protected String semestar;

    public Predmet(int ECTS, String naziv, String semestar) {
        this.ECTS = ECTS;
        this.naziv = naziv;
        this.semestar = semestar;
    }

    public int getECTS() {
        return ECTS;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getSemestar() {
        return semestar;
    }

    public boolean jePolozen(int ocjena){
        return ocjena>1;
    }


    public abstract int dajEcts(int ocjena);

    public abstract boolean ulaziUProsjek();

    public abstract String opisi(int ocijena);



}
