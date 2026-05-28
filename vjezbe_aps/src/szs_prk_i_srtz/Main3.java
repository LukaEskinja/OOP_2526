package szs_prk_i_srtz;

public class Main3 {
    public static void main(String[] args) {
        Osoba[] osobe = {
                new Student("Marko", "Markić", "12345678901", "0012345678", 4.5),
                new Profesor("Ivan", "Ivić", "98765432109", "docent", 15),
                new Student("Ana", "Anić", "55544433322", "0087654321", 4.8)
        };

        for (Osoba o : osobe) {
            System.out.println(o);
        }

        String trazeniOib = "98765432109";
        Osoba pronadena = pronadiPoOIB(osobe, trazeniOib);

        if (pronadena != null) {
            System.out.println("\nPronađena osoba: " + pronadena);
        } else {
            System.out.println("\nOsoba s OIB-om " + trazeniOib + " nije pronađena.");
        }
    }

    public static Osoba pronadiPoOIB(Osoba[] niz, String oib) {
        for (Osoba o : niz) {
            if (o.getOib().equals(oib)) {
                return o;
            }
        }
        return null;
    }
}
