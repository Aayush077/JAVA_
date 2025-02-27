


package Marketing;

public class Sales extends General.Employee {
    public Sales(int empid, String ename) {
        super(empid, ename);
    }
    
    public double tallowance(double basic) {
        return 0.05 * earnings(basic);
    }
    
}
