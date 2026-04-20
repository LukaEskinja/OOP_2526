package inner_cls_pckg;

public class Spiderman extends Man implements Fly{

    public Spiderman(String name) {
        super(name);
    }

    @Override
    public void flyingAbility() {
        System.out.println("Can naturaly fly...");
    }

}
