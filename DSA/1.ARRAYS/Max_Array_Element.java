import java.util.*;
public class Max_Array_Element {
    public static void main(String[] arrgs){
        //Max of Array
        //Q) Write an algorithm to find the max in an array
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scan.nextInt();
        }


        //main logic
        int max =Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
