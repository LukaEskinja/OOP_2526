package jed_sam;

public class Main4 {
    public static void main(String[] args) {
        PretvorivoUTekst a = new Adresa(
                "Obala kralja Petra Kresimira IV 2",
                "Zadar", 23000);

        PretvorivoUTekst k = new Kontakt("Ana Anic", "ana@unizd.hr");

        System.out.println(a.uTekst());
        System.out.println(k.uTekst());
    }
}
