





package General;

public class Employee {
    protected int empid;
    private String ename;
    
    public Employee(int empid, String ename) {
        this.empid = empid;
        this.ename = ename;
    }
    
    public double earnings(double basic) {
        return basic + (0.8 * basic) + (0.15 * basic);
    }
}
