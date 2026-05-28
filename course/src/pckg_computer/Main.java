package pckg_computer;

public class Main {
    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2028", "Dell","240");

        Monitor theMonitor = new Monitor("27 inch", "Acer", "1920 x 1080", 27);

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", "v.22", 6, 4);

        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theCase, theMonitor, theMotherboard);

//        thePC.getMonitor().drawPixelAt(22,11,"blue");
//        thePC.getMotherboard().loadProgram("PAC-Man");
//        thePC.getComputerCase().pressPowerButton();

            thePC.powerUp();
    }
}
