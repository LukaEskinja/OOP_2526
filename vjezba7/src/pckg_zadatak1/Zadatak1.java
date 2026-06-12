package pckg_zadatak1;

import java.util.ArrayList;
import java.util.Collections;

public class Zadatak1 {

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

        Collections.sort(lista, new SilazniAbecedniComparator());

        System.out.println("Sortirani niz u silaznom redoslijedu:");
        System.out.println(lista);
    }
}
