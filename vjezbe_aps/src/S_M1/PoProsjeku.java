package S_M1;

public class PoProsjeku implements KomparatorStudenata {
    @Override
    public int usporedi(Student s1, Student s2) {
        if (s1.getProsjek() < s2.getProsjek()) return 1;
        if (s1.getProsjek() > s2.getProsjek()) return -1;
        return 0;
    }
}
