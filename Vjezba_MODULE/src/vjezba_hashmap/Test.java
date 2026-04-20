package vjezba_hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, String> podaci = new HashMap<>();
        HashMap<Student, Integer[]> studentiPodaci = new HashMap<>();
        Integer[] ocj = {2,3,4,5,5};
        studentiPodaci.put(new Student("Miro"), ocj);
        studentiPodaci.put(new Student("Olga"),ocj);
        studentiPodaci.put(new Student("Mira"), ocj);
        listHMElements(studentiPodaci);
        TreeMap<Student, Integer[]> tmStudenti = new TreeMap<>(studentiPodaci);
        System.out.println(tmStudenti);
        podaci.put(21, "Stipe");
        podaci.put(159, "Divna");
        podaci.put(985, "Etna");
        podaci.put(455, "Petar");
        podaci.put(5788, "Vlatka");
        System.out.println(podaci);
        TreeMap<Integer,String> tmPodaci = new TreeMap<>(podaci);
        System.out.println(tmPodaci);

    }

    private static <K,V> void listHMElements(HashMap<K,V> podaci){
        Set<Map.Entry<K,V>> entrySet = podaci.entrySet();
        for(Map.Entry<K,V> es:entrySet){
            System.out.println(es.getKey() + "-" + es.getValue());
        }
    }





}
