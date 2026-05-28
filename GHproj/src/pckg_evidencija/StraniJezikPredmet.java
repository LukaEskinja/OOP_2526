package pckg_evidencija;

public class StraniJezikPredmet extends Predmet{

    public StraniJezikPredmet(int ECTS, String naziv,String semestar) {
        super(ECTS, naziv,semestar);
    }

    @Override
    public int dajEcts(int ocjena) {
        return jePolozen(ocjena) ? ECTS : 0;
    }

    @Override
    public boolean ulaziUProsjek() {
        return false;
    }

    @Override
    public String opisi(int ocjena) {
        return naziv + ", IZBORNI " + ECTS + " ECTS, ocjena " + ocjena + " semestar: " + semestar;
    }


}
