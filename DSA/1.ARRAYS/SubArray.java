import java.util.*;
public class SubArray {
    public static void main(String[] arg){
        //Q) Write an algorithm to print all the subarray of an array
        // A subarray is a contiguous part of the array
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Limited No: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scan.nextInt();
        }
        // Main Logic
        int si = 0 ;// Start index start with= 0 
        int ei = 0; //End index Start with = 0 
        for(si = 0 ; si < n ; si++){
            for(ei = si;ei<n;ei++){

                for(int k = si; k <= ei ;k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }

    }
}