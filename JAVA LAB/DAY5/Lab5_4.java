/*:Write a class Account containing acc_no, balance as data members
and two methods as input() for taking input from user and disp() method to display the details.
Create a subclass Person which has name and aadhar_no as extra data members and
override disp() function. Write the complete program to take and print details of three persons.

Input: Enter details of three persons.
Output: Display details of three persons.*/
import java.util.Scanner;
public class Lab5_4 {
    public static void main(String[] args) {
        Person p[] = new Person[3];
        for(int i=0; i<3; i++){

            p[i] = new Person();
            System.out.println("Enter details of person "+(i+1));
            p[i].input();
        }
        for(int i=0; i<3; i++){
            System.out.println("Details of person "+(i+1));
            p[i].disp();
        }
        
    }
}


class Account{
    int acc_no;
    double balance;
    void input(){
        System.out.print("Enter account number: ");
        Scanner sc = new Scanner(System.in);
        acc_no = sc.nextInt();
        System.out.print("Enter balance: ");
        balance = sc.nextDouble();
    }
    void disp(){
        System.out.println("Account number: "+acc_no);
        System.out.println("Balance: "+balance);
    }
}

class Person extends Account{
    String name;
    int aadhar_no;
    void input(){
        super.input();
        System.out.print("Enter name:");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.print("Enter aadhar number:");
        aadhar_no = sc.nextInt();
    }
    void disp(){
        super.disp();
        System.out.println("Name: "+name);
        System.out.println("Aadhar number: "+aadhar_no);
    }
}