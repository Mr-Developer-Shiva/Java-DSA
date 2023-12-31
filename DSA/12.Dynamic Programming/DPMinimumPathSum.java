/**
 * DPMinimumPathSum
 */
public class DPMinimumPathSum {
    public static void main(String[] args) {
        int[][] arr =  {{1,3,1},
                        {1,5,1},
                        {4,2,1}};       //Output => 7
        int[][] dp = new int[arr.length][arr[0].length];
        System.out.println(MinPathSum(arr,0,0,dp));
    }
    public static int MinPathSum(int[][] arr,int i,int j,int[][] dp){
        if(i>=arr.length || j >= arr[0].length ){
            return Integer.MAX_VALUE;
        }
        if(i == arr.length-1 && j == arr[0].length -1){
            return arr[i][j];
        }
        if(dp[i][j] != 0){
            return dp[i][j];
        }
        int rightPath = MinPathSum(arr, i, j+1,dp);
        int bottomPath = MinPathSum(arr, i+1, j,dp);

        dp[i][j] = arr[i][j] + Math.min(rightPath, bottomPath); 
        return arr[i][j] + Math.min(rightPath, bottomPath);
    }
}