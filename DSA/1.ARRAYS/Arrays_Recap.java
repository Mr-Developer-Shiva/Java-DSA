
public class Arrays_Recap{
    /*ARRAYS 
     * Arrays is a Data struucture that stores data of the same type in a 
     * sequential manner.An array takes a contiguous section od memory.
     */
    public static void main(String[] ard){
        //Arrsy with initial value (Size determined automatically)
                    //0,1,2,3,4
        int[] arr1 = {1,2,3,4,5};   //Size => 5

        //Empty array with size = 5.Initially all values are 0.
        int[] arr2 = new int[5];
        //get
        System.out.println(arr1[0]);
        //set 
        arr2[0] = 10;
        System.out.println(arr2[0]);
        //length
        System.out.println(arr2.length);

        //traverse
        for(int i = 0 ; i < arr1.length ; i++){
            System.out.println(arr1[i]);
        }
    }
}