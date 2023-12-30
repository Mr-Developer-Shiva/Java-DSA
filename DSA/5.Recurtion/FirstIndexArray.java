public class FirstIndexArray {
    public static void main(String[] args){
        int[] arr = {2,3,6,9,8,3,2,6,2,4};
        int x = 10;
       System.out.println(FirstIndex(arr,x,0));

    }
    public static int FirstIndex(int[] arr,int x,int i){
        if(i == arr.length){
            return -1;
        }

        if(arr[i]==x){
            return i;
        }
        else{
            int index = FirstIndex(arr, x, i+1);
            return index;
        }
    }
}
