package S_M2;

public class Main {
    public static void main(String[] args) {
        Ocjenjivo[] aktivnosti = {
                new Ispit("Matematika 1", 45),
                new SeminarskiRad("Objektno programiranje", 20),
                new Laboratorij(5, 4)
        };

        for (Ocjenjivo a : aktivnosti) {
            System.out.println(a.naziv() + " -> Bodovi: " + a.bodovi());
        }

        System.out.println("------------------------------------");
        System.out.println("Ukupan broj bodova: " + ukupno(aktivnosti));
    }

    public static int ukupno(Ocjenjivo[] akt) {
        int suma = 0;
        for (Ocjenjivo a : akt) {
            suma += a.bodovi();
        }
        return suma;
    }
}
