public class ClimbStairsTopDown {
    public static void main(String[] args) {
        // Top down Approach 
        int N = 6;
        int[] dp = new int[N+1];
        System.out.println(Stairs(N,dp));
    }
    public static int Stairs(int N,int[] dp){
        if(N == 1 || N == 2){
            return N;
        }
        if(N == 3 ){
            return N+1;
        }
        if(dp[N] != 0){
            return dp[N];
        }
       int num1 = Stairs(N-1, dp);
       int num2 = Stairs(N-2, dp);
       int num3 = Stairs(N-3, dp);

       dp[N] = num1 + num2 + num3;
       return num1 + num2 + num3;
    }
}