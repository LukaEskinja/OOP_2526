package S_M1;

public class PoImenu implements KomparatorStudenata {
    @Override
    public int usporedi(Student s1, Student s2) {
        int rez = s1.getPrezime().compareTo(s2.getPrezime());
        if (rez == 0) {
            return s1.getIme().compareTo(s2.getIme());
        }
        return rez;
    }
}
