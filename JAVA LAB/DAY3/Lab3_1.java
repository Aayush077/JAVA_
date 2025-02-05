/* Find the largest among 3 user entered nos. at the command prompt using
Java
Input: Enter three number .
Output: Display the Largest Number*/
public class Lab3_1 {

    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);   // Integer.parseInt() is used to convert string to integer
        int b = Integer.parseInt(args[1]);   // Integer.parseInt() is used to convert string to integer
        int c = Integer.parseInt(args[2]);
        if (a > b && a > c) {
            System.out.println("Largest number is " + a);
        } else if (b > a && b > c) {
            System.out.println("Largest number is " + b);
        } else {
            System.out.println("Largest number is " + c);
        }
    }
}
