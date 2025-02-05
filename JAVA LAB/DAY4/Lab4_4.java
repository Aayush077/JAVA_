/*Write a program to overload subtract method with various parameters in a
class in Java. Write the driver class to use the different subtract methods using object.
Input: Mention various subtract method having different parameters.
Output: Subtract method will display the result accordingly
*/



public class Lab4_4{
	public static void main(String[] args){
		Subtract s = new Subtract();
		s.subtract(10, 5);
		s.subtract(10.5, 5.5);
		s.subtract(10, 5, 2);
	}
}

class Subtract{
	void subtract(int a, int b){
		System.out.println("Subtracting two integers: " + (a - b));
	}
	
	void subtract(double a, double b){
		System.out.println("Subtracting two doubles: " + (a - b));
	}
	
	void subtract(int a, int b, int c){
		System.out.println("Subtracting three integers: " + (a - b - c));
	}
}