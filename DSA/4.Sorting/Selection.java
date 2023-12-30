public class Selection {
    public static void main(String[] args){
        int[] arr = {2,8,4,-1,7,10,5,6};
        SelectionSort(arr);
    }
    public static void SelectionSort(int[] arr){
        for(int i = 0 ; i < arr.length - 1;i++){
            int min = arr[i] ;
            int minIdx = i ;

            for(int j = i+ 1 ; j < arr.length;j++){
                if(arr[j] < min){
                    min = arr[j];
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        for(int value : arr){
            System.out.println(value);
        }
    }
}
