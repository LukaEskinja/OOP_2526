package pckg_uml_abs;

import pckg_uml.SportsCar;

public class TestClient {
    public static void main(String[] args) {
        SportsGPMotor mot1 = new SportsGPMotor("Ducati","H1000");
        SportsCar spc = new SportsCar("Mercedes","SLK");
        mot1.startVeh();
        mot1.stopVeh();
        mot1.vehInfo();

        spc.startVeh();
        spc.stopVeh();
        spc.vehInfo();

    }
}
