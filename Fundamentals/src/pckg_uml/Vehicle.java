package pckg_uml;

public class Vehicle {

    protected String model;

    protected String brand;

    protected String date;

    protected int vehID;

    protected static int autoInc = 10;

    public Vehicle(){


    }

    public Vehicle(String model, String brand){
        this.brand = brand;
        this.model = model;
        this.vehID = autoInc++;

    }

    public void setDate(String stringDate){
        this.date = stringDate;

    }

    public void startVehicle(){
        System.out.println("Starting"+ this.getClass().getSimpleName());
    }

    public void stopVehicle(){
        System.out.println("Stop:" + this.getClass().getSimpleName() );
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", date='" + date + '\'' +
                ", vehID=" + vehID +
                '}';
    }

    protected void vehInfo(){
        System.out.println(this.toString());
    }
}
