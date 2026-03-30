package pckg_arr_2;

import java.util.Scanner;

public class MainApp {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        Float[] temps = ArrPomocna.getUserDefinedTemp(scanner, 7);
        System.out.println(temps);
        ArrPomocna.aboveBelow(temps);
    }
}
