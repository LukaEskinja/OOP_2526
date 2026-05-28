package primjeri_abs;

public class Main {
    public static void main(String[] args) {
        GeometrijskiOblik k = new Krug(5.0);
        GeometrijskiOblik p = new Pravokutnik(4.0, 7.0);

        System.out.println(k.opis());
        System.out.println(p.opis());
    }
}
