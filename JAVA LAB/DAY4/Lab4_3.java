/*Write a program in java to input and display the details of n number of
students having roll, name and cgpa as data members. Also display the name of the
student having lowest cgpa.

Input: Enter Roll No, Name and cgpa of ‘n’ number of students.
Output: Display the details of ‘n’ number of students. Also display the name of

student with lowest cgpa*/
import java.util.Scanner;
public class Lab4_3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int n = sc.nextInt();
		Student[] students = new Student[n];
		for(int i = 0; i < n; i++){
			students[i] = new Student();
			students[i].read();
		}
		for(int i = 0; i < n; i++){
			students[i].display();
		}
		System.out.println("Student with lowest cgpa: " + students[0].lowestCgpa(students));
	}
}

class Student{
	int roll;
	String name;
	double cgpa;
	
	void read(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter roll: ");
		roll = sc.nextInt();
		System.out.print("Enter name: ");
		name = sc.next();
		System.out.print("Enter cgpa: ");
		cgpa = sc.nextDouble();
	}
	
	void display(){
		System.out.println("Roll: " + roll);
		System.out.println("Name: " + name);
		System.out.println("CGPA: " + cgpa);
	}
	
	String lowestCgpa(Student[] students){
		double min = students[0].cgpa;
		String name = students[0].name;
		for(int i = 1; i < students.length; i++){
			if(students[i].cgpa < min){
				min = students[i].cgpa;
				name = students[i].name;
			}
		}
		return name;
	}
		
}