package pckg_model;

import java.util.Objects;

public class Student extends OsobaSaFakulteta implements MogucaIdentifikacija,MogucIzvjestaj,Comparable<Student>{

    private String JMBAG;

    private int godinaUpisa;

    private String studij;

    private String email;

    public Student(String ime, String prezime, int godinaUpisa, String JMBAG, String studij, String email) {
        super(ime, prezime);
        this.JMBAG = JMBAG;
        this.godinaUpisa = godinaUpisa;
        this.studij = studij;
        this.email = email;
    }

    public int getGodinaUpisa() {
        return godinaUpisa;
    }

    public String getJMBAG() {
        return JMBAG;
    }

    public String getStudij() {
        return studij;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String generirajIzvjestaj() {
        return getJMBAG() + " " + getIme() + " " + getPrezime() +" "+ getStudij() + ", upis " + getGodinaUpisa()+ "mail " + getEmail();
    }

    @Override
    public int compareTo(Student drugi) {
        return this.studij.compareTo(drugi.studij);
    }

    // return Integer.compare(....,....)

//    provjera ima li vec taj student
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
    return Objects.equals(JMBAG, s.JMBAG);
    }

    @Override
    public int hashCode() {
        return Objects.hash(JMBAG);
    }

    @Override
    public String toString() {
        return generirajIzvjestaj();
    }

    @Override
    public String getID() {
        return JMBAG;
    }


}
