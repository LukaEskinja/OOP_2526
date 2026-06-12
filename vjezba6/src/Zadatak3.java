import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Zadatak3 {

    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        popuniSkup(hashSet);
        popuniSkup(linkedHashSet);
        popuniSkup(treeSet);

        provjeriIDodaj(hashSet, "Nema ga");
        provjeriIDodaj(linkedHashSet, "Nema ga");
        provjeriIDodaj(treeSet, "Nema ga");
        System.out.println();

        System.out.println("HashSet:");
        ispisiSkup(hashSet);
        System.out.println();

        System.out.println("LinkedHashSet:");
        ispisiSkup(linkedHashSet);
        System.out.println();

        System.out.println("TreeSet:");
        ispisiSkup(treeSet);
        System.out.println();

        System.out.println("Pokušaj ponovnog dodavanja elementa: Nema ga");
        pokusajDodatiDuplikat(hashSet, "Nema ga");
        System.out.println();

        System.out.println("Testiranje brisanja elementa Nema ga:");
        izbrisiElement(hashSet, "Nema ga");
        System.out.println("HashSet nakon brisanja:");
        ispisiSkup(hashSet);
    }

    public static void popuniSkup(Set<String> skup) {
        skup.add("Java");
        skup.add("Python");
        skup.add("C++");
        skup.add("Kotlin");
        skup.add("C#");
    }

    public static void provjeriIDodaj(Set<String> skup, String element) {
        if (!skup.contains(element)) {
            System.out.println("Traženi element nije pronađen: " + element);
            skup.add(element);
            System.out.println("Element je dodan u skup.");
        } else {
            System.out.println("Element već postoji u skupu.");
        }
    }

    public static void pokusajDodatiDuplikat(Set<String> skup, String element) {
        if (!skup.add(element)) {
            System.out.println("Element već postoji – skup ne dopušta duplikate.");
        }
    }

    public static void ispisiSkup(Set<String> skup) {
        System.out.println(skup);
    }

    public static void izbrisiElement(Set<String> skup, String element) {
        if (skup.remove(element)) {
            System.out.println("Element " + element + " je uspješno izbrisan.");
        } else {
            System.out.println("Element " + element + " se ne nalazi u skupu.");
        }
    }
}
//Skupovi (Set) u Javi po definiciji ne dopuštaju duplikate.
// Kada ponovno pokušamo dodati element "Nema ga", metoda .add() vraća false, a struktura skupa ostaje potpuno nepromijenjena.
//HashSet: Elementi nemaju nikakav zajamčeni redoslijed. Raspoređeni su nasumično (prema svojoj hash vrijednosti)
//LinkedHashSet: Elementi striktno zadržavaju redoslijed umetanja.Novi element "Nema ga" se ispisuje na samom kraju jer je zadnji i dodan.
//TreeSet: Elementi su automatski sortirani abecednim (prirodnim) redoslijedom. "C#" i "C++" dolaze na početak, dok se ostali elementi slažu po abecedi bez obzira na to kada su ubačeni.