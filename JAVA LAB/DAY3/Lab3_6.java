/*Find sum of each diagonal (left &amp; right) elements separately of a user
entered 3 X 3 matrix in Java.

Input: Enter 3X3 matrix
e.g. 6 7 3
8 9 2
1 2 9
Output: Left=24
Right=13*/

public class Lab3_6 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int left = 0;
        int right = 0;
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(args[k]);
                k++;
            }
        }
        for (int i = 0; i < 3; i++) {
            left += arr[i][i];
            right += arr[i][2 - i];
        }
        System.out.println("Left=" + left);
        System.out.println("Right=" + right);
    }
}
