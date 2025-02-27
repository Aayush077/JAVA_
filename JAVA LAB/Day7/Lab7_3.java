
/*
	Write a Java class which has a method called ProcessInput(). This
method checks the number entered by the user. If the entered number is negative then
throw an user defined exception called NegativeNumberException, otherwise it displays
the double value of the entered number.
*/

import java.util.Scanner;
public class Lab7_3{
	public static void main(String[] args){
		Lab7_3 obj = new Lab7_3();
		obj.ProcessInput();

	}
	
	void ProcessInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		try{
			if(num < 0){
				throw new Exception("Negative number ");
			}else{
				System.out.println("Double value of the number: "+num*2);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}

}