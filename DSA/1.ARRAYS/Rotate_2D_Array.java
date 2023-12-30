public class Rotate_2D_Array {
    //code Write rotate the 2D square motion 90' clockwise.
    public static void main(String[] argd){
        int[][] arr = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};
                    //   System.out.println(arr.length);  = 4 
                    //   System.out.println(arr[0].length); = 4

        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0 ; j < i ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i = 0 ; i < arr.length;i++){
            for(int j = 0 ; j < arr[0].length;j++){
           
            }
           
        }
                //Reverse a Array
       for(int i = 0 ; i < arr.length ; i++){
         int left  = 0 ; 
        int right =  arr[0].length-1;
        while(left < right ){
            int temp = arr[i][left];
            arr[i][left] = arr[i][right];
            arr[i][right] = temp;
            left++;
            right--;
        }
       }
      for(int i = 0 ; i < arr[0].length;i++){
        for(int j = 0 ; j < arr.length;j++ ){
            System.out.print(arr[i][j] + "  ");
        }
        System.out.println();
      }
    }
       
    }

