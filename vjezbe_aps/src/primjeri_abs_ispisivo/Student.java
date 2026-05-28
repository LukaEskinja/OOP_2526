package primjeri_abs_ispisivo;

public class Student implements Ispisivo {
    private String ime;
    private String jmbag;

    public Student(String ime, String jmbag) {
        this.ime = ime;
        this.jmbag = jmbag;
    }

    @Override
    public void ispisi() {
        System.out.println("Student: " + ime + " (JMBAG: " + jmbag + ")");
    }
}

