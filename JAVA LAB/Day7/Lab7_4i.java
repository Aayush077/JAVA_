/*
 * Write a program to create user defined exceptions called
HrsException, MinException and SecException. Create a class Time which contains data
members hours, minutes, seconds and a method to take a time from user which throws
the user defined exceptions if hours (&gt;24 &amp;&lt;0),minutes(&gt;60 &amp;&lt;0),seconds(&gt;60 &amp;&lt;0).
user input hours, minute,seconds.
 */
import java.util.Scanner;  
class HrsException extends Exception{
    HrsException(String s){
        super(s);
    }
}

class MinException extends Exception{
    MinException(String s){
        super(s);
    }
}

class SecException extends Exception{
    SecException(String s){
        super(s);
    }
}

class Time{
    int hrs, min, sec;
    Time(int h, int m, int s){
        hrs = h;
        min = m;
        sec = s;
    }
    void display(){
        System.out.println("Correct Time-> "+hrs+":"+min+":"+sec);
    }
    void takeTime() throws HrsException, MinException, SecException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours: ");
        hrs = sc.nextInt();
        System.out.println("Enter minutes: ");
        min = sc.nextInt();
        System.out.println("Enter seconds: ");
        sec = sc.nextInt();
        if(hrs>=24 || hrs<0){
            throw new HrsException("Invalid hours");
        }
        if(min>=60 || min<0){
            throw new MinException("Invalid minutes");
        }
        if(sec>=60 || sec<0){
            throw new SecException("Invalid seconds");
        }
    }
}

public class Lab7_4i{
    public static void main(String[] args){
        Time obj = new Time(0,0,0);
        try{
            obj.takeTime();
            obj.display();
        }catch(HrsException e){
            System.out.println(e);
        }catch(MinException e){
            System.out.println(e);
        }catch(SecException e){
            System.out.println(e);
        }
    }
}

