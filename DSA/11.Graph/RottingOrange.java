import java.util.LinkedList;

public class RottingOrange{
    public static void main(String[] args) {
        int[][] arr = {{0,1,1,0},
                       {2,1,0,1 },
                       {1,1,2,0},
                       {1,1,1,1} };
        System.out.println(rottingOrange(arr));
    }
    public static int rottingOrange(int[][] arr){
        LinkedList<int[]> q = new LinkedList<>();           //This int[] is time

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr.length ; j++){
                if(arr[i][j] == 2){
                    int[] temp = {i,j,0};
                    q.addLast(temp);
                }
            }
        }
        int ans = 0 ;
        while(q.size() > 0){
            int[] rem = q.removeFirst();
            int r = rem[0];
            int c = rem[1];
            int time = rem[2];
            ans = time ;

            if(r+1 < arr.length  && arr[r+1][c] == 1){
                int[] temp = {r+1,c,time+1};
                q.add(temp);
                arr[r+1][c] = 2 ;
            }
            if(c-1 >= 0 && arr[r][c-1] == 1){
                int[] temp = {r,c-1,time+1};
                q.add(temp);
                arr[r][c-1] = 2 ;
            }
            if(r-1 >= 0 && arr[r-1][c]==1){
                int[] temp = {r-1,c,time+1};
                q.add(temp);
                arr[r-1][c] = 2 ;
            }
            if(c+1 < arr[0].length && arr[r][c+1] == 1){
                int[] temp = {r,c+1,time+1};
                q.add(temp);
                arr[r][c+1] = 2 ;
            }
        }
        for(int i = 0 ; i <arr.length;i++){
            for(int j= 0 ; j < arr.length ; j++){
                if(arr[i][j] == 1){
                    return -1;
                }
            }
        }
        return ans;
    }
}