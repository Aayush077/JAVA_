/*
 * Write a Java program to handle an ArithmeticException using try,
catch, and finally block.
Input: Operand values for division operation mentioned in the program
Output: ArithmeticException caught by try-catch-finally block
 * 
 */

public class Lab7_2 {
        public static void main(String[] args) {
            int a;
            try{
                a = 10/0;
            }catch(ArithmeticException e){
                System.out.println(e);
            }finally{
                System.out.println("ArithmeticException caught by try-catch-finally block");
            }
        }
}
