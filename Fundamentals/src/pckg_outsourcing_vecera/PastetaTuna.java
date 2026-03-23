package pckg_outsourcing_vecera;

import pckg_osnovni_vecera.Predjelo;

import java.util.concurrent.ThreadLocalRandom;

public class PastetaTuna extends Predjelo {

    // Stavit ćemo neki datum za uvođenje ovog predjela
    private static String uvedenaGod = "22-12-1997";
    private static int jedCijena = 70;

    // Constructor
    public PastetaTuna() {
        // TODO Auto-generated constructor stub
        setNaziv();
        setVrsta();
        setKolicina();
        infoPastetaTuna();
        System.out.println(" /////////////////////////////////////");
    }

    // Methods
    public void setNaziv() {
        this.naziv = "Pašteta";
    }

    public void setVrsta() {
        this.vrsta = "od tune";
    }

    public void setKolicina() {

        this.kolicina = ThreadLocalRandom.current().nextInt(1, 3);
    }

    public String getNaziv() {
        return naziv;
    }

    public String getVrsta() {
        return vrsta;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void infoPastetaTuna() {

        System.out.println("Predjelo je: " + getNaziv() + " " + getVrsta() + " " + getKolicina() + " tanjura!");
        System.out.println("Uvedeno od: " + PastetaTuna.uvedenaGod);

    }

    public void meniInfoJP() {

        System.out.println("Predjelo je: " + getNaziv() + " " + getVrsta() + " | cijena: " + PastetaTuna.jedCijena + " kn!");

    }

    public int getJedCijena() {

        return PastetaTuna.jedCijena;
    }
}
