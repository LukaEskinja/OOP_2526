package pckg_worker;

public class HourlyEmployee extends Employee{

    private double hourlyPayRate;

    public HourlyEmployee(String birthDate, String endDate, String name, double pay, long employeeid, String hireDate, double hourlyPayRate) {
        super(birthDate, endDate, name, pay, employeeid, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public void getDoublePay(){
        double pay = 2*getPay();
    }
}
