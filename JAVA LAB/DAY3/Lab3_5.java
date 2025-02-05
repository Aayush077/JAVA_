/*Find the no. of occurrence of each element in a user entered list of nos.
    Enter list of numbers e.g.( 15 25 15 11 25 32 15 32)
Output: Occurrence of 15=3
Occurrence of 25=2
Occurrence of 11=1
Occurrence of 32=2

*/

public class Lab3_5 {
    public static void main(String[] args) {
        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        int[] count = new int[100];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                System.out.println("Occurence of " + i + "=" + count[i]);
            }
        }
    }
}

