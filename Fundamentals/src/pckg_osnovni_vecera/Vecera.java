package pckg_osnovni_vecera;

import pckg_outsourcing_vecera.Desert;
import pckg_outsourcing_vecera.GlavnoJelo;
import pckg_outsourcing_vecera.PastetaTuna;

import java.text.ParseException;

public class Vecera {
    public static void main(String[] args) throws ParseException {

        Meni meni = new Meni();
        System.out.println("****************************");
        JuhaPoriluk jp = new JuhaPoriluk();
        PastetaTuna pt = new PastetaTuna();
        meni.cijenaSimul(jp, pt);



        Predjelo predjelo = new Predjelo();
        GlavnoJelo glavno = new GlavnoJelo();
        Desert desert = new Desert();

        predjelo.pojediPredjelo("Juha od poriluka");
        System.out.println(predjelo.pojeoSamKolPredjela("Paštete", "Tunjevina", 3));
        System.out.println(glavno.toString());
        desert.pojediDesert("Torta");
        System.out.println(desert.pojeoSamKolDeserta("Sladoled", "Jagoda", 2));

        /////////// Izdvojeno s namjerom ////////////////////

        System.out.println("\n");

        System.out.println("Zanima nas neki podatak od klase Predjelo: " + predjelo.naziv);

        // Pristup atributu naziv koji je specificiran kao protected je moguć iz klase Vecera
        // Koja nije u "obiteljskoj vezi" s klasom Predjelo!

        predjelo.setUvedenoGodine();
        predjelo.infoDate();

    }
}