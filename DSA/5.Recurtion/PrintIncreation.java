public class PrintIncreation {
    //Recution is Function calling itSelf.
    public static void main(String[] args) {
        PrintIncreationRecurtion(7);
    }
    public static void PrintIncreationRecurtion(int N){
        if(N == 0){
            return ;
        }
        PrintIncreationRecurtion(N-1);
        System.out.println(N);
    }
}
