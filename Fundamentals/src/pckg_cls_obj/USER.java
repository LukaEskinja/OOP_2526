package pckg_cls_obj;

public class USER {

    protected String name;

    protected String email;

    private static int cntID = 100;

    protected int id;

    public USER(String name, String email){
        this.name = name;
        this.email = email;
        this.id = cntID++;

    }

    public void performSomeStudyAction() {
        System.out.println(name + "performing some study!");
    }



    @Override
    public String toString() {
        return "USER{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}


