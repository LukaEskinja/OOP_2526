import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Zadatak2 {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(21,"Stipe");
        hashMap.put(159,"Marko");
        hashMap.put(985,"Martina");
        hashMap.put(455,"Petar");
        hashMap.put(5788,"Vlatka");

        System.out.println("Ispis HashMap strukture:");
        ispisiMapu(hashMap);
        System.out.println();

        TreeMap<Integer, String> treeMap = new TreeMap<>(hashMap);

        System.out.println("Ispis TreeMap strukture:");
        ispisiMapu(treeMap);
        System.out.println();

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(5788,"Vlatka");
        linkedHashMap.put(159,"Marko");
        linkedHashMap.put(985,"Martina");
        linkedHashMap.put(455,"Petar");
        linkedHashMap.put(21,"Stipe");

        System.out.println("Ispis LinkedHashMap strukture:");
        ispisiMapu(linkedHashMap);
    }

    public static void ispisiMapu(Map<Integer, String> mapa) {
        for (Integer kljuc : mapa.keySet()) {
            System.out.println(kljuc + "   -> " + mapa.get(kljuc));
        }
    }
}
// linked hashmap je ispisao u redosljedu hash-kljuceva sto u ovom sliucaju izgleda gotovo nasumicno
// treemap je slozio po kljucevima
// lhm je ispisao u onom redosljedu u kojem su upisane osobe