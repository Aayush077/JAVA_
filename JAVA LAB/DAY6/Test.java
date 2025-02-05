/* Illustrate the usage of abstract class with following Java classes –
 An abstract class ‘student’ with two data members roll no, reg no, a method getinput() and an abstract
method course()

 A subclass ‘kiitian’ with course() method implementation
Write the driver class to print the all details of a kiitian object.*/
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Kiitian k = new Kiitian();
        k.getinput();
        String[] course = {args[0]};
        k.course(course);
        printDetails(k);
    }

    public static void printDetails(Kiitian k) {
        System.out.println("Roll no: " + k.roll);
        System.out.println("Registration no: " + k.regno);
    }


}

abstract class Student{
    int roll;
    int regno;
    
    void getinput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll no.: ");
        roll = sc.nextInt();
        System.out.print("Enter registeration no. :");
        regno = sc.nextInt();
    }
    
    abstract void course(String[] course);
}

class Kiitian extends Student{
    void course(String[] course){
        System.out.println("Course: " + course[0]);
    }
}
