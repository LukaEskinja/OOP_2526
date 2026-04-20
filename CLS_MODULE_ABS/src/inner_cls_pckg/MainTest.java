package inner_cls_pckg;

import java.util.ArrayList;

public class MainTest {

    public static void main(String[] args) {
        OuterCLS outer1 = new OuterCLS("IMEEE !");
        System.out.println(outer1);
        OuterCLS.InnerCLS inner1 = outer1.new InnerCLS("IME unutarnje!");
        inner1.InnerInfo();
        OuterCLS.InnerCLS inner2 = outer1.createInnerClsObject("Ime druge unutarnje!");
        inner2.InnerInfo();
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(21);
        intList.add(22);
        listElements(intList);

    }

    private static void listElements(ArrayList <Integer> elements){
        for(Integer el : elements){
            System.out.println(el);
        }
    }
}
