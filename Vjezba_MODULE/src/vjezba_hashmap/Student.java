package vjezba_hashmap;

import java.util.Comparator;

public class Student implements Comparator<Integer> {
    private  String name;
    private int id;
    private static int cntID = 10;

    public Student(String name){
        this.name = name;
        this.id = cntID++;
    }

    public String getName(){
        return this.name;
    }

    public Integer getId(){
        return this.id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}
