package vj_hm;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int id;
    private int godine;
    private static int cntID = 20;

    public Student(String name, int godine){
        this.godine = godine;
        this.name = name;
        this.id = cntID++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGodine() {
        return godine;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, godine);
    }

    @Override
    public String toString() {
        return "Student{" +
                "godine=" + godine +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Student other){
      /*  if(this.id > other.id){
            return 1;
        } else if (this.id < other.id) {
            return -1;
        }else {
            return 0;
        }*/
        return Integer.compare(this.id, other.id);
    }
}
