package pckg_uml_abs;

public class SportsGPMotor implements Veh{

    private String brand;

    private String model;

    private int id;

    private static int cntID = 35;

    public SportsGPMotor(String rand, String model){
        this.id = cntID++;
        this.brand = brand;
        this.model = model;
    }
    @Override
    public void startVeh() {

        System.out.println("GP Motor is starting..."+ this.model);

    }

    @Override
    public void stopVeh() {

        System.out.println("GP Motor is starting..."+ this.model);

    }

    @Override
    public String toString() {
        return "SportsGPMotor{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public void vehInfo() {
        System.out.println(this.toString());
    }
}
