public class Bubble {
    public static void main(String[] args) {
        int[] arr = {4,6,8,3,9,-1,5,2};
        BubbleSort(arr);
    }
    public static void BubbleSort(int[] arr){

        for(int i = 0 ; i < arr.length - 1 ; i++){
            for(int j = 0 ; j < arr.length - 1 ; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp ;
                }
            }

        }

        for(int value : arr){
            System.out.println(value);
        }
    }
}
