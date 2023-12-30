public class DPFibonacciBottomUp{
    public static void main(String[] args) {
        //Dynamic Programming Bottom Up Approach 
        int N = 4;
        System.out.print(fibonacci(N));
    }
    public static int fibonacci(int N){
        int[] dp = new int[N+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2 ;i < dp.length;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[dp.length-1];
    }
}