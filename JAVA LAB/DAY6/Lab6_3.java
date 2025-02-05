/*-Define an interface with three methods – earnings(), deductions() and bonus()
and define a Java class ‘Manager’ which uses this interface without implementing bonus() method.
Also define another Java class ‘Substaff’ which extends from ‘Manager’ class and implements
bonus() method. Write the complete program to find out earnings, deduction and bonus of a
substaff with basic salary amount entered by the user as per the following guidelines –
earnings basic + DA (80% of basic) + HRA (15% of basic)
deduction PF 12% of basic
bonus 50% of basic
Input -Basic salary - 50000
Output -Earnings - 97500
Deduction -6000
Bonus - 25000 */
import java.util.Scanner;
public class Lab6_3 {
    public static void main(String[] args) {
        Substaff s = new Substaff();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        int basic = sc.nextInt();
        s.basic = basic;
        s.da = (int)(0.8 * s.basic);
        s.hra = (int)(0.15 * s.basic);
        s.pf = (int)(0.12 * s.basic);
        s.earnings();
        s.deductions();
        s.bonus();
        
    }
}


interface Salary{
    void earnings();
    void deductions();
    void bonus();
}

abstract class Manager implements Salary{
    int basic;
    int da;
    int hra;
    int pf;
    
    public void earnings(){
        System.out.println("Earnings: " + (basic + da + hra));
    }
    
    public void deductions(){
        System.out.println("Deductions: " + pf);
    }
}


class Substaff extends Manager{
    public void bonus(){
        System.out.println("Bonus: " + (basic/2));
    }
}

