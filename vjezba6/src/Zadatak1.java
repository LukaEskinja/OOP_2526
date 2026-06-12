import java.util.ArrayList;
import java.util.LinkedList;

public class Zadatak1 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");
        arrayList.add("C#");
        arrayList.add("JavaScript");

        LinkedList<String> linkedList = new LinkedList<>(arrayList);

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
        System.out.println();

        linkedList.add("Kotlin");
        System.out.println("Nakon dodavanja na kraj:");
        System.out.println(linkedList);
        System.out.println();

        linkedList.addFirst("Ruby");
        linkedList.addLast("Swift");

        System.out.println("Nakon dodavanja na početak i kraj LinkedList:");
        for (String jezik : linkedList) {
            System.out.println(jezik);
        }
        System.out.println();

        zamijeniElement(linkedList, 4, "Zamijenjeni element");
        System.out.println("Nakon brisanja 5. elementa i umetanja novog:");
        System.out.println(linkedList);
        System.out.println();

        System.out.println("Poziv unaprijeđene metode (brisanje 6. elementa):");
        zamijeniElementSIspisom(linkedList, 5, "Novi element");
        System.out.println("Konačna lista nakon oba testiranja:");
        System.out.println(linkedList);
    }

    public static void zamijeniElement(LinkedList<String> lista, int indeks, String noviElement) {
        if (indeks >= 0 && indeks < lista.size()) {
            lista.remove(indeks);
            lista.add(indeks, noviElement);
        } else {
            System.out.println("Indeks je izvan granica liste");
        }
    }

    public static void zamijeniElementSIspisom(LinkedList<String> lista, int indeks, String noviElement) {
        if (indeks >= 0 && indeks < lista.size()) {
            String izbrisaniElement = lista.remove(indeks);
            lista.add(indeks, noviElement);
            System.out.println("Izbrisani element je: " + izbrisaniElement);
        } else {
            System.out.println("Indeks je izvan granica liste");
        }
    }
}