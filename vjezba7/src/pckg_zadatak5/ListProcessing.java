package pckg_zadatak5;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListProcessing {
    public static void insertVeh(LinkedList<String> lista, String novoVozilo) {
        ListIterator<String> litr = lista.listIterator();
        while (litr.hasNext()) {
            String vozilo = litr.next();
            System.out.println("ListIterator čita: " + vozilo);
            if (vozilo.equals("electronic bike")) {
                System.out.println("Dodajem novo vozilo: " + novoVozilo);
                litr.add(novoVozilo);
            }
        }
    }
}
