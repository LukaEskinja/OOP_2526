package pckg_uml_abs;

public class SportsGPMotor extends VehCommon{

    public SportsGPMotor(String brand,String model){
        super(brand,model);
    }
    @Override
    public void startVeh() {

        System.out.println("SportsGPCar starting..."+ this.getClass().getSimpleName()+"- "+this.id);

    }

    @Override
    public void stopVeh() {

        System.out.println("SportsGPCar stopping..."+ this.getClass().getSimpleName()+"- "+this.id);

    }

    @Override
    public void vehInfo(){
        System.out.println(this.toString());
    }

    @Override
    public void changeTires() {
        System.out.println("SportsGPCar changing 2 tires..."+ this.getClass().getSimpleName()+"- "+this.id);
    }
}
