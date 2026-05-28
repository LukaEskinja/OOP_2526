package pckg_worker;

public class Employee extends Worker {

    private long employeeid;

    private String hireDate;

    private static int employeeNo;

    public Employee(String birthDate, String endDate, String name, double pay, long employeeid, String hireDate) {
        super(birthDate, endDate, name, pay);
        this.employeeid = Employee.employeeNo++;
        this.hireDate = hireDate;
    }
}
