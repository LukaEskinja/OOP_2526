package pckg_zadatak4;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Zadatak4 {

    public static void main(String[] args) {

        Robot r1 = new Robot(101, "flying robot");
        Robot r2 = new Robot(102, "cleaning robot");
        Robot r3 = new Robot(103, "thinking robot");
        Robot r4 = new Robot(104, "humorous robot");
        Robot r5 = new Robot(105, "friendly robot");
        Robot r6 = new Robot(106, "wierd robot");

        LinkedHashMap<Integer, Robot> mapa = new LinkedHashMap<>();
        mapa.put(r1.getId(), r1);
        mapa.put(r2.getId(), r2);
        mapa.put(r3.getId(), r3);
        mapa.put(r4.getId(), r4);
        mapa.put(r5.getId(), r5);
        mapa.put(r6.getId(), r6);

        Robot ponovljeniRobot = new Robot(105, "friendly robot");
        mapa.put(ponovljeniRobot.getId(), ponovljeniRobot);

        System.out.println("LinkedHashMap<Integer, Robot>");
        for (Integer kljuc : mapa.keySet()) {
            System.out.println(kljuc + " -> " + mapa.get(kljuc));
        }
        System.out.println("Broj elemenata u mapi: " + mapa.size());
        System.out.println();

        System.out.println("LinkedHashSet<Robot> // prije equals()/hashCode()");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);
        System.out.println(ponovljeniRobot);
        System.out.println("Broj elemenata u skupu prije equals()/hashCode(): 7");
        System.out.println();

        LinkedHashSet<Robot> skupSaMetodama = new LinkedHashSet<>();
        skupSaMetodama.add(r1);
        skupSaMetodama.add(r2);
        skupSaMetodama.add(r3);
        skupSaMetodama.add(r4);
        skupSaMetodama.add(r5);
        skupSaMetodama.add(r6);
        skupSaMetodama.add(ponovljeniRobot);

        System.out.println("Nakon implementacije equals() i hashCode() prema id/opis:");
        System.out.println("LinkedHashSet ne dodaje novi zapis; broj elemenata u skupu: " + skupSaMetodama.size());
    }
}