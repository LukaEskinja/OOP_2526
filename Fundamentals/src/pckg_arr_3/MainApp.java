package pckg_arr_3;

public class MainApp {
    public static void main(String[] args) {
        float[][] vals = new float[2][2];
        float[][] dvals = {{2,3},{5,6}};
        int fst = dvals[0].length;
        int all = dvals.length;
        System.out.println(all);
        System.out.println(fst);

    }
}
