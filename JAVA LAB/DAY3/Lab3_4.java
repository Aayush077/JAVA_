/*Program to find no. of objects created out of a class using ‘static’
modifier.
Input: No of objects created
Output: Display the number of objects created (e.g. no of objects=3)*/

public class Lab3_4{
	static int count =0;
	public Lab3_4(){
	count++;
	}
	public static void main(String[] args){
	Lab3_4 c1= new Lab3_4();
	Lab3_4 c2= new Lab3_4();
        System.out.println("No of object created is "+Lab3_4.count);
	}
}
