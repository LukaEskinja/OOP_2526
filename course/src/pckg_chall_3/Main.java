package pckg_chall_3;

public class Main {
    public static void main(String[] args) {

        SmartKitchen sm1 = new SmartKitchen();

//        sm1.getCoffeMaker().setHasWorkToDo(true);
//        sm1.getIceBox().setHasWorkToDo(true);
//        sm1.getDishWasher().setHasWorkToDo(true);
//
//        sm1.getDishWasher().doDishes();
//        sm1.getIceBox().orderFood();
//        sm1.getCoffeMaker().brewCoffe();

        sm1.setKitchenState(true,true,true);
        sm1.doKitchenWork();
    }


}
