/*Program to sort the user entered list of numbers of any size

Input: List of Numbers
Output: Display the numbers in Ascending order*/


public class Lab3_3 {
    public static void main(String[] args){
        
        int n = args.length;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(args[i]);
        }
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

	
}