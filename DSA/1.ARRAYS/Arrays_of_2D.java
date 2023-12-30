public class Arrays_of_2D {
    public static void main(String[] argd){
        int[][] arr = new int[5][6];
        //set 
        arr[1][3] = 10 ;
        //get
        System.out.println(arr[1][3]);
        System.out.println(arr[3][5]);

        //row count
        System.out.println(arr.length);
        //col count
        System.out.println(arr[0].length);
        //Total count 
        System.out.println(arr.length * arr[0].length);
        //traversal
         for(int i = 0 ;i < arr.length;i++){     //i -> row
            for(int j = 0 ; j < arr[0].length;j++){ // j -> col
                //processing
            }
        }
    }
}
