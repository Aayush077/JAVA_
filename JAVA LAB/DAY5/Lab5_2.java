/*: Illustrate the execution of constructors in multi-level inheritance with three
Java classes – plate(length, width), box(length, width, height), wood box (length, width, height, thick)
where box inherits from plate and woodbox inherits from box class. Each class has constructor where
dimensions are taken from user.
Input: Enter the dimensions
Output: Display the dimensions accordingly*/
import java.util.Scanner;
public class Lab5_2 {
    public static void main(String[] args) {
        Woodbox wb = new Woodbox();
        wb.display();

    } 
}

class Plate{
	int length; 
	int width;
    Plate() {
        System.out.println("Enter the dimensions of the sheet:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length:");
        length = sc.nextInt();
        System.out.println("Enter the width:");
        width = sc.nextInt();
    }
}

class Box extends Plate{
	int height;
    Box() {
        super();
        System.out.println("Enter the height of the box:");
        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();
    }
}

class Woodbox extends Box{
	int thick;
    Woodbox() {
        super();
        System.out.println("Enter the thickness of the woodbox:");
        Scanner sc = new Scanner(System.in);
        thick = sc.nextInt();
    }
    void display(){
        System.out.println("The dimensions of the plate are: "+length+"x"+width);
        System.out.println("The dimensions of the box are: "+length+"x"+width+"x"+height);
        System.out.println("The dimensions of the woodbox are: "+length+"x"+width+"x"+height+"x"+thick);

    }
}