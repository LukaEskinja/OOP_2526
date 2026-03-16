package pckg_cls_obj;

public class SuperUser extends USER{
    public SuperUser(String name, String email, int id){
        super(name, email);
        this.id = id;

    }

    @Override
    public void performSomeStudyAction(){
        System.out.println(name + "performing some study!");
    }
}
