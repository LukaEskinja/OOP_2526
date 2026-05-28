package pckg_chall_4;

public class Main {
    public static void main(String[] args) {
        Printer prt = new Printer(true,20);
        prt.printPages(20);

        Printer prt2 = new Printer(false,20);
        prt2.printPages(20);

    }

}
