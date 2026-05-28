package pckg_evidencija;

public class SeminarskiRad extends Predmet{

    public SeminarskiRad(int ECTS, String naziv, String semestar) {
        super(ECTS, naziv, semestar);
    }

    @Override
    public boolean jePolozen(int ocjena) {
        return ocjena >= 4;
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
        return naziv + ", SEMINAR " + ECTS + "ECTS, ocjena " + ocjena + " semestar: " + semestar;
    }
}
