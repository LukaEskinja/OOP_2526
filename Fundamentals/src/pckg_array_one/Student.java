package pckg_array_one;

public class Student {

    private String name;

    private int id;

    private static int cntID = 100;

    public Student(String name){
        this.id = cntID++;
        this.name = name;

    }



    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
