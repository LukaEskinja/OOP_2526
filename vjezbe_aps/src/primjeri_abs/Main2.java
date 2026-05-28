package primjeri_abs;

public class Main2 {
    public static void main(String[] args) {
        Zivotinja[] zivotinje = {
                new Pas("Rex"),
                new Macka("Mici"),
                new Pas("Bella")
        };

        for (Zivotinja z : zivotinje) {
            z.predstaviSe();
        }
    }
}
