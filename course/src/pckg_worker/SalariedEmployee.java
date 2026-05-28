package pckg_worker;

public class SalariedEmployee extends Employee {

    private double annualSalary;

    private boolean isRetired;

    public SalariedEmployee(String birthDate, String endDate, String name, double pay, long employeeid, String hireDate, double annualSalary, boolean isRetired) {
        super(birthDate, endDate, name, pay, employeeid, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retire(){
        isRetired = true;
        System.out.println(getName() + "is now retired at " + getAge());
    }

    @Override
    public String toString() {
        return "{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}
