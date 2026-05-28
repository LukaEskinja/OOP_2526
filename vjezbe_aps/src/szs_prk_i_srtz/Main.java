package szs_prk_i_srtz;

public class Main {
    public static void main(String[] args) {
        KnjiznicnaJedinica[] gradja = {
                new Knjiga("Na Drini cuprija", 1945, "Ivo Andric", "978-953-1234"),
                new Casopis("Informatica", 2024, 47, "Dr. Maric"),
                new Knjiga("Mali princ", 1943, "Antoine de Saint-Exupery", "978-953-5678")
        };

        System.out.println("=== Bibliotecka gradja === ");
        for (KnjiznicnaJedinica bj : gradja) {
            System.out.println(bj);
        }
    }
}
