import java.util.Scanner;
public class BubbleSort{
    public static void Sort(int[] arr){
        for(int i = 0 ; i < arr.length - 1;i++){
            for(int j = 0 ; j < arr.length - i - 1;j++){
                if(arr[j] < arr[j+1]){      // use greater than decreament operation
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }  
        } 
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Limited No: ");
        int n = scan.nextInt();

        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scan.nextInt();
        }
        // for(int value : arr){
        //     System.out.print(value + " ");
        // }
        Sort(arr);
        for(int value : arr){
            System.out.print(value + " ");
        }
    }
}