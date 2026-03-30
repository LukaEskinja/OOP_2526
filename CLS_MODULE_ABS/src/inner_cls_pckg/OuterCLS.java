package inner_cls_pckg;

public class OuterCLS {

    private int id;

    private static int cntID = 1;

    private String nameIT;

    private static final String OUTERNME = "Name for the outer cls!";

    public OuterCLS(){
        System.out.println("Creating an object of the outer CLS!");
    }

    public OuterCLS(String nameIT){
        this.nameIT = nameIT;
        this.id = cntID++;
    }

    class InnerCLS{

        String someInnerName;

        public InnerCLS(String name){
            this.someInnerName = name;
        }

        public void InnerInfo(){
            System.out.println("This is the object of the:" + this.getClass().getSimpleName());
            System.out.println("This inner cls id - hashcode:" + Integer.toHexString(this.hashCode()));
            System.out.println("This is some other object:" + OuterCLS.this.getClass().getSimpleName());
            System.out.println("This is outer cls id - hashcode:"+ Integer.toHexString((OuterCLS.this.hashCode())));


        }

        @Override
        public String toString() {
            return "innerCLS{" +
                    "someInnerName='" + someInnerName + '\'' +
                    '}';
        }
    }


    public InnerCLS createInnerClsObject(String InnerCLSObjectname){
        return new InnerCLS(InnerCLSObjectname);
    }

    @Override
    public String toString() {
        return "OuterCLS{" +
                "id=" + id +
                ", nameIT='" + nameIT + '\'' +
                '}';
    }


}

