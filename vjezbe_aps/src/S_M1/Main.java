package S_M1;

public class Main {
    public static void main(String[] args) {
        Student[] studenti = {
                new Student("Marko", "Marić", 3.8),
                new Student("Ana", "Anić", 4.9),
                new Student("Ivan", "Marić", 4.2),
                new Student("Zdenka", "Barić", 4.5)
        };

        System.out.println("--- Sortirano po prezimenu i imenu ---");
        sortiraj(studenti, new PoImenu());
        ispisi(studenti);

        System.out.println("\n--- Sortirano po prosjeku (padajuće) ---");
        sortiraj(studenti, new PoProsjeku());
        ispisi(studenti);
    }

    public static void sortiraj(Student[] niz, KomparatorStudenata komp) {
        int n = niz.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (komp.usporedi(niz[j], niz[j + 1]) > 0) {
                    Student temp = niz[j];
                    niz[j] = niz[j + 1];
                    niz[j + 1] = temp;
                }
            }
        }
    }

    private static void ispisi(Student[] niz) {
        for (Student s : niz) {
            System.out.println(s);
        }
    }
}
