package inner_cls_pckg;

public class Arrow implements Fly, RunFast{
    @Override
    public void flyingAbility() {
        System.out.println("Cant fly");
    }
    @Override
    public void fastRunningAbility() {
            System.out.println("Cant run");
        }
    }



