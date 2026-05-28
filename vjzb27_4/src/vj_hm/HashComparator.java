package vj_hm;

import java.util.Comparator;

public class HashComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.hashCode(), o2.hashCode());
    }
}
