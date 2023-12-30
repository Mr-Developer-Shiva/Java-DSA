public class Factorial {
    public static void main(String[] args){
        int N = 5;
        System.out.println(fact(N));
    }
    public static int fact(int N){
        if(N==0){
            return 1;
        }

        int nm1fact = fact(N-1);
            return N*nm1fact;
    }
}
