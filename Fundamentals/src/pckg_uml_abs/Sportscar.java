package pckg_uml_abs;

public class Sportscar implements Veh{

    private static int cntID = 20;

    private int id;

    private String name;

    private String model;

    public Sportscar(String brand,String model){
        this.id = cntID++;
        this.name = brand;
        this.model = model;


    }

    @Override
    public void startVeh() {
        System.out.println("Starting in specific car way:" + this.getClass().getSimpleName()+ "- " + this.id);
    }

    @Override
    public void stopVeh() {
        System.out.println("Stopping in specific car way:" + this.getClass().getSimpleName()+ "- " + this.id);

    }

    @Override
    public String toString() {
        return "Sportscar{" +
                "id=" + id +
                '}';
    }

    @Override
    public void vehInfo() {
        System.out.println(this.toString());

    }
}
