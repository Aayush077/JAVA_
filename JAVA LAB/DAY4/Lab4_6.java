/*Write a program in java using constructor overloading concept to calculate
the area of a rectangle having data member as length and breadth. Use default constructor to
initialize the value of the data member to zero and parameterized constructor to initialize the value
of data member 
according to the user input.

Input: length :
breadth :
Output: Display the area of rectangle accordingly.
*/

import java.util.Scanner;

class Rectangle {
    double length;
    double breadth;

    Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

  
    double calculateArea() {
        return length * breadth;
    }
}

public class Lab4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle rect1 = new Rectangle();
        System.out.println("Area of rectangle with default constructor: " + rect1.calculateArea());

        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();
        Rectangle rect2 = new Rectangle(length, breadth);
        System.out.println("Area of rectangle with parameterized constructor: " + rect2.calculateArea());

        sc.close();
    }
}