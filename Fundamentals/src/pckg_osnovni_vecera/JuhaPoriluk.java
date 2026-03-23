package pckg_osnovni_vecera;

import java.util.concurrent.ThreadLocalRandom;

public class JuhaPoriluk extends Predjelo {

    // Stavit ćemo neki datum za uvođenje ovog predjela
    private static String uvedenaGod = "17-08-1988";
    private static int jedCijena = 30;

    // Constructor
    public JuhaPoriluk() {

        setNaziv();
        setVrsta();
        setKolicina();
        infoJuhaPoriluk();
        System.out.println(" /////////////////////////////////////");
    }

    // Methods
    private void setNaziv() {
        naziv = "Juha";
    }

    public String getNaziv() {
        return naziv;
    }

    public String getVrsta() {
        return vrsta;
    }

    private  void setVrsta() {
        vrsta = "od poriluka";
    }

    public void setKolicina() {

        this.kolicina = ThreadLocalRandom.current().nextInt(1, 3);
    }

    public int getKolicina() {
        return kolicina;
    }

    public void infoJuhaPoriluk() {

        System.out.println("Predjelo je: " + getNaziv() + " " + getVrsta() + " " + getKolicina() + " tanjura!");
        System.out.println("Uvedeno od: " + JuhaPoriluk.uvedenaGod);
    }

    public void meniInfoJP() {

        System.out.println("Predjelo je: " + getNaziv() + " " + getVrsta() + " | cijena: " + JuhaPoriluk.jedCijena + " kn!");

    }

    public int getJedCijena() {

        return JuhaPoriluk.jedCijena;
    }

}
