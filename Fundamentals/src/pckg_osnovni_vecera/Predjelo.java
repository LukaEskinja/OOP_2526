package pckg_osnovni_vecera;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Predjelo {

    // Ranije smo naglasili da je poželjno izbjegavati javnu dostupnost atributa
    protected String naziv;
    protected String vrsta;
    protected int kolicina;
    private Date uvedenoGodine;

    public Predjelo() {
        System.out.println("Kreiram objekt klase Predjelo");

    }

    public void pojediPredjelo(String naziv) {

        System.out.println("Jedem predjelo: " + naziv);
    }

    // Izostavimo oznaku pristupa za sljedeću metodu
    String pojeoSamKolPredjela(String naziv, String vrsta, int kolicina) {


        return naziv + " " + vrsta + " predjela i to u sljedećoj količini: " + kolicina;
    }

    public void setUvedenoGodine() throws ParseException {

        Scanner sc = new Scanner(System.in);
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Please enter the date in the form dd-MM-yyyy:");
        String date = sc.nextLine();
        uvedenoGodine = df.parse(date);
        sc.close();
    }

    public String getUvedenoGodine() {

        String date;
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        date = df.format(uvedenoGodine);

        return date;
    }

    private String getHexHashData(){
        return this.getClass() + "@" + Integer.toHexString(this.hashCode());
    }

    public void infoDate() {
        System.out.println("Predjelo je u ovaj restoran uvedeno od: " + uvedenoGodine);
        System.out.println("Object data -> " + getHexHashData());
    }
}
