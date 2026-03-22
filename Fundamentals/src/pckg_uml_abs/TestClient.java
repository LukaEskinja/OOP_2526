package pckg_uml_abs;

public class TestClient {
    public static void main(String[] args) {
        SportsGPMotor mot1 = new SportsGPMotor("Ducati","H1000");
        Driver driver = new Driver ("John");
        System.out.println("Name of the driver:" + driver.driverName);
        Sportscar spc = new Sportscar("BMW","X5", driver);

        mot1.startVeh();
        mot1.stopVeh();
        mot1.vehInfo();
        mot1.changeTires();

        System.out.println("------------");

        spc.startVeh();
        spc.stopVeh();
        spc.vehInfo();
        spc.changeTires();

    }
}
