package pckg_chall_2;

public class Test {
    public static void main(String[] args) {

        Costumer costumer = new Costumer("Tim",1000,"tim@tom.com");
        System.out.println(costumer.getName());
        System.out.println(costumer.getEmail());
        System.out.println(costumer.getCreditLimit());

        Costumer secondCostumer = new Costumer();
        System.out.println(secondCostumer.getName());
        System.out.println(secondCostumer.getEmail());
        System.out.println(secondCostumer.getCreditLimit());

        Costumer thirdCostumer = new Costumer("joe", "joemail");
        System.out.println(thirdCostumer.getName());
        System.out.println(thirdCostumer.getEmail());
        System.out.println(thirdCostumer.getCreditLimit());


    }

}
