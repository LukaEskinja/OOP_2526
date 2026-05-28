package pckg_evidencija;

public class IzborniPredmet extends Predmet {

    public IzborniPredmet(int ECTS, String naziv, String semestar) {
        super(ECTS, naziv, semestar);
    }

    @Override
    public int dajEcts(int ocjena) {
        return jePolozen(ocjena) ? ECTS : 0;
    }

    @Override
    public boolean ulaziUProsjek() {
        return true;
    }

    @Override
    public String opisi(int ocjena) {
        return naziv + ", IZBORNI " + ECTS + " ECTS, ocijena " + ocjena + " semestar: " + semestar;
    }


}
