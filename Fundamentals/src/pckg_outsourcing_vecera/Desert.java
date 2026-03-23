package pckg_outsourcing_vecera;

public class Desert {

    // Desert ćemo kreirati prema predlošku predjela uz minimalne izmjene
    // Ranije smo naglasili da je poželjno izbjegavati javnu dostupnost atributa
    String naziv;
    String vrsta;
    int kolicina;

    public Desert() {
        System.out.println("Kreiram objekt klase Desert");

    }

    public void pojediDesert(String naziv) {

        System.out.println("Jedem desert: " + naziv);
    }

    // Izostavimo oznaku pristupa za sljedeću metodu
     public String pojeoSamKolDeserta(String naziv, String vrsta, int kolicina) {


        return naziv + " " + vrsta + " deserta i to u sljedećoj količini: " + kolicina;
    }
}
