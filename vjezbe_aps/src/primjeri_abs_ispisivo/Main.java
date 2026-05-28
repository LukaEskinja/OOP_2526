package primjeri_abs_ispisivo;

public class Main {
    public static void main(String[] args) {
        Ispisivo[] stavke = {
                new Student("Ana Anic", "0123456789"),
                new Predmet("Programiranje", 6),
                new Student("Ivan Ivic", "9876543210"),
                new Predmet("Baze podataka", 5)
        };

        for (Ispisivo s : stavke) {
            s.ispisi();
        }
    }
}
