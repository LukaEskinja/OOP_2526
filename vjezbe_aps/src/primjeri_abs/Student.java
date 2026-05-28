package primjeri_abs;

public class Student implements Ispisivo {
    private String ime;

    public Student(String ime) {
        this.ime = ime;
    }

    @Override
    public void ispisi() {
        System.out.println("Student: " + ime);
    }
}
