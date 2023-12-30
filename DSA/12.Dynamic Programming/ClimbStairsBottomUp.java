public class ClimbStairsBottomUp {
    public static void main(String[] args) {
        // Bottom Up Approach 
        int N = 6;
        System.out.println(Stairs(N));
    }
    public static int Stairs(int N){
        int[] dp = new int[N+1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i = 4; i<dp.length;i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        return dp[dp.length-1];
    }
}