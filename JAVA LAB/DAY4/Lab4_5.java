/*Write a program which will overload the area () method and display the
area of a circle, triangle and square as per user choice and user entered dimensions.

Input: Mention dimensions like radius, base, height, side
Output: Display area of circle
Display area of triangle
Display area of square
*/
import java.util.Scanner;
public class Lab4_5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		Area n = new Area();
		System.out.println("Enter the length of square:");
		int l = sc.nextInt();
		System.out.println("Enter the radius of circle:");
		float r = sc.nextFloat();
		System.out.println("Enter the base and height of triangle :");
		int  b = sc.nextInt();
		int  h = sc.nextInt();
		n.area(r);
		n.area(b,h);
		n.area(l);
	}
	
}	

class Area{
	void area(float r){
		System.out.println("Area of circle is :" + 3.14*(r*r));
	}
	void area(int b, int h){
		System.out.println("Area of triangle is :" + 0.5*(b*h));
	} 
	void area(int l){
		System.out.println("Area of square is :" +(l*l));
	}
}