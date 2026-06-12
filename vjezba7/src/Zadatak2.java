import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Zadatak2 {

    public static void main(String[] args) {
        ArrayList<Integer> brojevi = generirajNasumicneBrojeve(10, 10, 1000);

        System.out.println("Početni niz nasumičnih brojeva:");
        System.out.println(brojevi);
        System.out.println();

        Collections.sort(brojevi);
        System.out.println("Sortirano u prirodnom (uzlaznom) slijedu:");
        System.out.println(brojevi);
        System.out.println();

        Collections.sort(brojevi, new Comparator<Integer>() {
            @Override
            public int compare(Integer b1, Integer b2) {
                return b2.compareTo(b1);
            }
        });

        System.out.println("Sortirano u obrnutom redoslijedu pomoću anonimne klase:");
        System.out.println(brojevi);
    }

    public static ArrayList<Integer> generirajNasumicneBrojeve(int brojElemenata, int min, int max) {
        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < brojElemenata; i++) {
            int nasumicniBroj = random.nextInt((max - min) + 1) + min;
            lista.add(nasumicniBroj);
        }

        return lista;
    }
}