package pckg_uml;

public class VehClient {

    private static Vehicle veh;

    private static SportsCar sc1;

    private static SportsCar sc2;

    public static void main(String[] args) {
        veh = new Vehicle("X4","BMW");
        sc1 = new SportsCar("Carrera","Porsche");
        sc2 = new SportsCar("Spider","Ferrari");
        veh.setDate("23-11-2008.");
        veh.vehInfo();
        veh.startVehicle();
        sc1.setDate("23-11-2008.");
        sc1.vehInfo();
        sc2.setDate("23-11-2008.");
        sc2.vehInfo();
        sc2.startVehicle();
    }
}
