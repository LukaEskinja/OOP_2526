package pckg_array_one;

public class Profesor {

    private String prNames;

    private int prId;

    private static int prCntID = 100;

    public Profesor(String name){
        this.prId = prCntID++;
        this.prNames = name;

    }

    @Override
    public String toString() {
        return "Profesor{" +
                "id=" + prId +
                ", prNames='" + prNames + '\'' +
                '}';
    }
}
