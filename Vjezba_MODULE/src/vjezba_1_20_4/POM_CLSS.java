package vjezba_1_20_4;

import java.util.ArrayList;

public class POM_CLSS {

    public static void addElementToList(ArrayList<String> lst, String addedElement) {
        if (lst == null) {
            System.out.println("List is null - define list!");
        } else {
            if (addedElement==null){
                System.out.println("Added element can not be bull");
            }else {


                lst.add(addedElement);
                System.out.println("Element added to list!");
            }
        }
    }
}