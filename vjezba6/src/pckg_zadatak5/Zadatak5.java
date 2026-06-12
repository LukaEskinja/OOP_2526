package pckg_zadatak5;

import java.util.ArrayList;
import java.util.Collections;

public class Zadatak5 {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("auto");
        lista.add("svemirski brod");
        lista.add("avion");
        lista.add("helikopter");
        lista.add("jedrilica");
        lista.add("gliser");
        lista.add("romobil");
        lista.add("bicikla");

        System.out.println("Ispis liste bez sortiranja:");
        System.out.println(lista);
        System.out.println();

        Collections.sort(lista);

        System.out.println("Kakav je sada rezultat (abecedno sortiranje):");
        System.out.println(lista);
        System.out.println();

        Collections.sort(lista, new LengthStrComparator());

        System.out.println("Ispis nakon sortiranja po duljini stringa:");
        for (String st : lista) {
            System.out.println(st);
        }
    }
}
//Nakon što primijenimo osnovnu metodu Collections.sort(lista),
//rezultat se mijenja tako da su svi elementi (stringovi) u listi sortirani abecednim redoslijedom.
//upotrebom klase LengthStrComparator,
//lista se preraspoređuje tako da kraće riječi dolaze na početak, a najdulje na sam kraj liste.
