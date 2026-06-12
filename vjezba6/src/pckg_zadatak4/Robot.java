package pckg_zadatak4;

import java.util.Objects;

public class Robot {

    private int id;
    private String opis;

    public Robot(int id, String opis) {
        this.id = id;
        this.opis = opis;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Robot robot = (Robot) o;
        return id == robot.id && Objects.equals(opis, robot.opis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, opis);
    }


    @Override
    public String toString() {
        return "Robot{" +
                "id=" + id +
                ", opis='" + opis + '\'' +
                '}';
    }
}
