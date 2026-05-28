package jed_sam;

public class Main {
    public static void main(String[] args) {
        Vozilo[] vozila = { new Automobil(), new Bicikl() };

        for (Vozilo v : vozila) {
            v.info();
        }
    }
}
