package szs_prk_i_srtz;

public class Student extends Osoba {
    private String jmbag;
    private double prosjek;

    public Student(String ime, String prezime, String oib, String jmbag, double prosjek) {
        super(ime, prezime, oib);
        this.jmbag = jmbag;
        this.prosjek = prosjek;
    }

    @Override
    public String uloga() {
        return "Student (JMBAG: " + jmbag + ", prosjek: " + prosjek + ")";
    }
}
