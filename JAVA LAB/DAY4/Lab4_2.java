/*Write a program in Java to create a class Rectangle having data members
length and breadth and three methods called read, calculate and display to read the values of
length and breadth, calculate the area and perimeter of the rectangle and display the result
respectively.
*/

import java.util.Scanner;
public class Lab4_2 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.read();
		r.calculate();
		r.display();
	}
}

class Rectangle {
	int length, breadth, area, perimeter;
	Scanner sc = new Scanner(System.in);
	
	void read() {
		System.out.print("Enter length: ");
		length = sc.nextInt();
		System.out.print("Enter breadth: ");
		breadth = sc.nextInt();
	}
	
	void calculate() {
		area = length * breadth;
		perimeter = 2 * (length + breadth);
	}
	
	void display() {
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
	}
}