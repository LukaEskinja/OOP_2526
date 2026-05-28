package vj_hm;

import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        TreeMap<Student, Integer[]> studenti = new TreeMap<Student, Integer[]>();
        Student s1 = new Student("Lovre", 19);
        Student s2 = new Student("Kristijan", 22);
        Student s3 = new Student("Lucija", 20);
        Student s4 = new Student("Božena", 23);
        Student s5 = new Student("Iva", 25);
        Student s6 = new Student("Luka", 29);
        studenti.put(s1, new Integer[]{1,2,3,4,5});
        studenti.put(s2, new Integer[]{3,2,3,4,5});
        studenti.put(s3, new Integer[]{1,4,3,4,5});
        studenti.put(s4, new Integer[]{1,5,3,4,5});
        studenti.put(s5, new Integer[]{5,2,3,4,5});
        studenti.put(s6, new Integer[]{4,5,3,4,5});
        System.out.println(studenti);
        TreeMap<Student, Integer[]> studentiImena = new TreeMap<>(new NameLengthComparator().reversed());
        studentiImena.putAll(studenti);
        System.out.println(studentiImena);
        listAllElements(studentiImena);
        TreeMap<Student, Integer[]> studentiGodine = new TreeMap<>(new AgeComparator().reversed());
        listAllElementsAge(studentiGodine);
        System.out.println(s1.hashCode());
        TreeMap<Student, Integer[]> studentiHash = new TreeMap<>(new HashComparator());
        studentiHash.putAll(studentiGodine);
        System.out.println(studentiHash);
        System.out.println(s6.hashCode());
        System.out.println(s1.hashCode());

    }

    private static void listAllElements(TreeMap<Student, Integer[]> tMap){
        for(Map.Entry<Student, Integer[]> elem : tMap.entrySet()){
            System.out.println("Key:" + elem.getKey().getName());
            System.out.println(elem.getValue());
            for(Integer ocj: elem.getValue()){
                System.out.println("Ocjena:" + ocj);
            }
        }
    }

    private static void listAllElementsAge(TreeMap<Student, Integer[]> tMap){
        for(Map.Entry<Student, Integer[]> elem : tMap.entrySet()){
            System.out.println("Key:" + elem.getKey().getGodine());
            System.out.println(elem.getValue());
            for(Integer godine: elem.getValue()){
                System.out.println("Godine:" + godine);
            }
        }
    }


}
