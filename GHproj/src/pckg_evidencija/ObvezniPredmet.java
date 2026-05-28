package pckg_evidencija;

public class ObvezniPredmet extends Predmet{

    public ObvezniPredmet(int ECTS, String naziv, String semestar) {
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
        return naziv + ", OBVEZNI " + ECTS + " ECTS, ocjena " + ocjena + " semestar: " + semestar;
    }


}
