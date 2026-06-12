package pckg_zadatak4;

import java.io.InputStream;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();

        InputStream ulazniTok = Zadatak4.class.getResourceAsStream("Zadatak4.txt");

        if (ulazniTok == null) {
            System.out.println("Greška: Datoteka Zadatak4.txt nije pronađena u paketu!");
            return;
        }

        try (Scanner scanner = new Scanner(ulazniTok)) {
            while (scanner.hasNextLine()) {
                String red = scanner.nextLine();
                lista.add(red);
            }
        }

        System.out.println("Ispis vezane liste (izvorni redoslijed iz datoteke):");
        System.out.println(lista);
        System.out.println();

        Collections.sort(lista, new DuljinaTekstaComparator());

        System.out.println("Ispis vezane liste nakon sortiranja prema duljini stringova:");
        System.out.println(lista);
    }
}