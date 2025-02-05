/*A Plastic manufacturer sells plastic in different shapes like 2D sheet and 3D
box. The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft. Implement
it in Java to calculate the cost of plastic as per the dimensions given by the user where 3D inherits
from 2D.
Input: Enter dimensions
Output: Display the cost of plastic*/
import java.util.Scanner;

public class Lab5_1 {
    public static void main(String[] args) {
        Box box = new Box();
        box.getDimensions();
        box.calculateCost();
    }
}

class Sheet {
    int length, breadth;

    void getDimensions() {
        System.out.println("Enter the dimensions of the sheet:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length:");
        length = sc.nextInt();
        System.out.println("Enter the breadth:");
        breadth = sc.nextInt();
    }
}

class Box extends Sheet {
    int height;

    void getDimensions() {
        super.getDimensions();
        System.out.println("Enter the height of the box:");
        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();

    }

    void calculateCost() {
        System.out.println("The cost of the box is: Rs." + (length * breadth * height * 60));
        System.out.println("The cost of the sheet is: Rs." + (length * breadth * 40));
    }
}
