package pckg_uml_abs;

abstract class VehCommon implements Veh{

    protected String brand;
    protected String model;
    protected int id;
    private static int cntID = 150;

    protected VehCommon(String brand, String model){
        this.brand = brand;
        this.model = model;
        this.id = cntID++;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", id=" + id +
                ", model='" + model + '\'' +
                '}';
    }

    protected abstract void changeTires();

}
