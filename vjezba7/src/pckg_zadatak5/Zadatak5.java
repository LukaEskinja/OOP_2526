package pckg_zadatak5;

import java.util.Iterator;
import java.util.LinkedList;

public class Zadatak5 {

    public static void main(String[] args) {
        LinkedList<String> vehicles = new LinkedList<>();
        vehicles.add("car");
        vehicles.add("helicopeter");
        vehicles.add("electronic bike");
        vehicles.add("truck");
        vehicles.add("motorcycle");
        vehicles.add("carriage");

        System.out.println("VJEŽBA 7 - ZADATAK 5: LinkedList, Iterator i ListIterator");
        System.out.println("========================================================");
        System.out.println();

        System.out.println("[1] Početna vezana lista vozila - ispis metodom printList()");
        printList(vehicles);
        System.out.println();

        System.out.println("[2] Ispis pomoću Iteratora i provjera elementa carriage");
        Iterator<String> itr = vehicles.iterator();
        while (itr.hasNext()) {
            String vozilo = itr.next();
            if (vozilo.equals("carriage")) {
                System.out.println("Iterator čita: " + vozilo + "  --> pronađeno, uklanjam element");
                itr.remove();
            } else {
                System.out.println("Iterator čita: " + vozilo);
            }
        }
        System.out.println();

        System.out.println("[3] Lista nakon uklanjanja elementa carriage");
        printList(vehicles);
        System.out.println();

        System.out.println("[4] ListIterator - umetanje novog vozila nakon electronic bike");
        ListProcessing.insertVeh(vehicles, "electric scooter");
        System.out.println();

        System.out.println("[5] Konačna lista vozila - ponovni ispis metodom printList()");
        printList(vehicles);
    }

    public static void printList(LinkedList<String> lista) {
        int brojac = 1;
        for (String vozilo : lista) {
            System.out.println("  " + brojac + ". " + vozilo);
            brojac++;
        }
    }
}
