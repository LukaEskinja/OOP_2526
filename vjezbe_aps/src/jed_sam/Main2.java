package jed_sam;

public class Main2 {
    public static void main(String[] args) {
        Zaposlenik z1 = new StalniZaposlenik("Ana", "Anic", 1500.0);
        Zaposlenik z2 = new HonorarniZaposlenik("Ivan", "Ivic", 15.0, 80);

        System.out.println(z1);
        System.out.println(z2);
    }
}
