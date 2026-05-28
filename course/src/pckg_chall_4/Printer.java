package pckg_chall_4;

public class Printer {

    private int tonerLevel;

    private int pagesPrinted;

    private boolean duplex;

    public Printer(boolean duplex, int tonerLevel) {
        this.duplex = duplex;
        this.tonerLevel = tonerLevel;
    }

    public int addToner(int TonerAmount){
        if (tonerLevel+TonerAmount > 100){
            return -1;
        } else if (tonerLevel+TonerAmount < 0) {
            return -1;
        }else {
            tonerLevel += TonerAmount;
            System.out.println("The toner level is" + tonerLevel + "%");
            return tonerLevel;
        }
    }

    public void printPages(int pages){
        if (duplex){
            pagesPrinted = pages/2;
            System.out.println("Printed "+ pagesPrinted + " pages");
            System.out.println("duplex printer");
        }else{
        System.out.println("Printed "+ pages + " pages");
        }
    }


}
