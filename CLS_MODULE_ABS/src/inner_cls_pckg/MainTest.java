package inner_cls_pckg;

public class MainTest {

    public static void main(String[] args) {
        OuterCLS outer1 = new OuterCLS("IMEEE !");
        System.out.println(outer1);
        OuterCLS.InnerCLS inner1 = outer1.new InnerCLS("IME unutarnje!");
        inner1.InnerInfo();
        OuterCLS.InnerCLS inner2 = outer1.createInnerClsObject("Ime druge unutarnje!");
        inner2.InnerInfo();

    }
}
