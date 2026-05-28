package pckg_chall_2;

public class Costumer {

    private String name;

    private double creditLimit;

    private String email;

    public Costumer(String name, double creditLimit, String email){
      this.name = name;
      this. creditLimit = creditLimit;
      this.email = email;
    }

    public Costumer(){
        this("Bob", "bobs@burgers.com");
    }

    public Costumer(String email, String name) {
        this(name, 1000, email);
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
