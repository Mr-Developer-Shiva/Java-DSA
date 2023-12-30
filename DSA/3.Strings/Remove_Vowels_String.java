public class Remove_Vowels_String{
    public static void main(String[] args) {
        //Q) Remove Vowels from the String
        String str = "YouCanDoIt";
        remove(str);
    }
    public static void remove(String str){
        for(int i = 0 ;i < str.length();i++){
           char ch = str.charAt(i);

           if(ch=='a' || ch=='e' || ch == 'i' || ch == 'o' || ch == 'u'){
            continue;
           }
           System.out.print(ch);
        }
    }
}