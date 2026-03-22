package pckg_uml_abs;

public class Sportscar extends VehCommon{
    //ok
    protected Driver driver;

    public Sportscar(String brand, String model, Driver driver) {
        super(brand, model);
    }
    @Override
    protected void changeTires() {
        System.out.println("SportsCar changing 4 tires..."+ this.getClass().getSimpleName());

    }

    @Override
    public void startVeh() {

        System.out.println("SportsCar starting...:" + this.getClass().getSimpleName() + "- " + this.id);

    }

    @Override
    public void stopVeh() {

        System.out.println("SportsCar stopping..."+ this.getClass().getSimpleName()+"- "+this.id);

    }

    @Override
    public void vehInfo() {
        System.out.println(this.toString());

    }
}

