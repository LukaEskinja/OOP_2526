package pckg_worker;

public class Test {
    public static void main(String[] args) {

        Employee emp1 = new Employee("12/22/2011","12/12/2012","Marko",2000, 22222L, "11/11/2011");
        System.out.println(emp1);
        emp1.collectPay(200);
        System.out.println(emp1);
        System.out.println("_________");
        SalariedEmployee smp1 = new SalariedEmployee("12/11/2000","12/22/2011","Marin",2000,1000, "11/11/2011", 1000,false);
        smp1.collectPay(200);
        smp1.retire();
        System.out.println(smp1);
        System.out.println("_________");
        HourlyEmployee hem1 = new HourlyEmployee("12/22/2011","12.12.2012","Marin",500, 22222L, "11.11.2011",10);
        hem1.getDoublePay();
        System.out.println(hem1);
        System.out.println("_________");




    }



}
