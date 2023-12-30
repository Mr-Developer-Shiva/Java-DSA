import java.util.*;
public class FirstRepeatingCharAt{ 
    public static void main(String[] args){
        String str = "abchfji";
        firstRepeatingChar(str);
    }
    public static void firstRepeatingChar(String str){
        HashSet<Character> set = new HashSet<>();
        for(int i = 0 ; i < str.length();i++){
            char ch = str.charAt(i);

            if(set.contains(ch))
            {
                System.out.println(ch);
                return;
            }
            else
            {
                set.add(ch);
            }
        }
        System.out.println(-1);
    }
}