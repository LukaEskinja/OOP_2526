package sloz_zad;

public class Main3 {
    public static int zbroj(Bodovljivo[] niz) {
        int suma = 0;
        for (Bodovljivo b : niz) {
            suma += b.bodovi();
        }
        return suma;
    }

    public static void main(String[] args) {
        Ispit ispit1 = new Ispit("Programiranje I", 42);
        Ispit ispit2 = new Ispit("Baze podataka", 35);
        SeminarskiRad sem1 = new SeminarskiRad("Apstraktne klase u Javi", 18);
        Biljeska bilj = new Biljeska("Ponoviti sucelja za kolokvij!");

        System.out.println("=== Ispis svih (Ispisivo[]) === ");
        Ispisivo[] sviZaIspis = {
                ispit1, ispit2, sem1, bilj
        };
        for (Ispisivo i : sviZaIspis) {
            i.ispisi();
        }

        System.out.println("\n=== Zbrajanje bodova (Bodovljivo[]) === ");
        Bodovljivo[] bodovani = { ispit1, ispit2, sem1 };
        System.out.println("Ukupno bodova : " + zbroj(bodovani));
    }
}
