public class DPFibonacciTopDown{
    public static void main(String[] args) {
        //Dynamic Programming Top Down Approach 
        int N = 10;
        int[] dp = new int[N+1];
        System.out.print(fibonacci(N,dp));
    }
    public static int fibonacci(int N,int[] dp){
        if(N == 0||N == 1){
            return N;
        }
        if(dp[N] != 0){
            return dp[N];
        }
       int nm1 = fibonacci(N-1,dp);
       int nm2 = fibonacci(N-2,dp);
        dp[N] = nm1 + nm2;
        return nm1 +nm2;
    }
}