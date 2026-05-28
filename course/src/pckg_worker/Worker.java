package pckg_worker;

public class Worker {

    private String name;

    private String birthDate;

    private String endDate;

    private double pay;

    public Worker(String birthDate, String endDate, String name, double pay) {
        this.birthDate = birthDate;
        this.endDate = endDate;
        this.name = name;
        this.pay = pay;
    }

    public int getAge() {
        int currentYear = 2026;
        int birthYear = Integer.parseInt(birthDate.substring(6));

        return (currentYear - birthYear);
    }

    public String getName() {
        return name;
    }

    public void collectPay(double amount){
        pay += amount;
    }

    public double getPay() {
        return pay;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "birthDate='" + birthDate + '\'' +
                ", name='" + name + '\'' +
                ", endDate='" + endDate + '\'' +
                ", pay=" + pay +
                '}';
    }
}


