import java.util.*;
public class Reverse_Arryay{
    // Reversing array in Element was Swaping Method
    public static void main(String[] ard){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Limited No: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i< n ; i++){
            arr[i] = scan.nextInt();
        }
        //Main Logic
        int i = 0;
        int j = n - 1;

        while(i < j ){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        for(int k = 0 ; k < n ; k++){
            System.out.print(arr[k] +" ");
        }
    }
}