/*
 * Write a Java program to generate an
ArrayIndexOutofBoundsException and handle it using catch statement.
Input: Enter the numbers -Example: 1 2 3 4 5 ( Suppose array size is 4 )
Output: Exception in thread “main” java.lang.ArrayIndexOutOfBoundsException:4
 */


public class Lab7_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        try{
            System.out.println(arr[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    
}
