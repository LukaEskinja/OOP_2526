package pckg_poli_dynamic;

public class Tiger extends Animal{

    @Override
    public void makeSomeSound(){
        super.makeSomeSound();
        System.out.println("Additionally" + this.getClass().getSimpleName() + "produces some ROARROAARORAOOR!");
    }
}
