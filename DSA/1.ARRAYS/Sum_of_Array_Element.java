public class Sum_of_Array_Element {
    public static void main(String[]args){
        //create a matrix =  2D Array  
        int[][] arr = new int[5][6];       //Total number 5 * 6 => 30

        //set 
        arr[2][5] = 100;
        //get 
        System.out.println(arr[2][5]);

        //Print 0.predefine values are 0
        System.out.println(arr[4][3]);

        //row count
        System.out.println(arr.length);
        //col count
        System.out.println(arr[0].length);

        //traversal
        for(int i = 0 ;i < arr.length;i++){     // i -> row
            for(int j = 0 ; j < arr.length ; j++){  //j -> col
                //processing
            
            }
        }
        System.out.println(arr.length * arr[0].length);

    }
}
