package pckg_chall_3;

public class SmartKitchen {

    private Refrigerator iceBox;

    private DishWasher dishWasher;

    private CoffeMaker coffeMaker;

    public SmartKitchen() {
        coffeMaker = new CoffeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }

    public CoffeMaker getCoffeMaker() {
        return coffeMaker;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void setKitchenState(boolean coffeFlag, boolean fridgeFlag, boolean dishWasherFlag){

        coffeMaker.setHasWorkToDo(coffeFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }

    public void doKitchenWork(){
        coffeMaker.brewCoffe();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}

class Refrigerator{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if(hasWorkToDo) {
            System.out.println("Orders food");
            hasWorkToDo = false;
        }
    }
}

class DishWasher{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if(hasWorkToDo) {
            System.out.println("Does the dishes");
            hasWorkToDo = false;
        }
    }
}

class CoffeMaker{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffe(){
        if(hasWorkToDo) {
            System.out.println("Brews coffe");
            hasWorkToDo = false;
        }
    }


}

