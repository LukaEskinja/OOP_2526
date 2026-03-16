package pckg_uml;

public class SportsCar extends Vehicle{

    public SportsCar(String model, String brand){
        super(model, brand);
    }


    @Override
    public void startVehicle() {
        System.out.println("Starting in specific way:" + this.getClass().getSimpleName() + ": " + this.vehID);

    }

    @Override
    public String toString() {
        return "SportsCar - {" +
                "brand='" + brand + '\'' +
                ", date='" + date + '\'' +
                ", model='" + model + '\'' +
                ", vehID=" + vehID +
                '}';
    }
}
