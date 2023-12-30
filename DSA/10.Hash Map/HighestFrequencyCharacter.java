import java.util.*;
public class HighestFrequencyCharacter{
    public static void main(String[] args) {
        String str = "abbbabdabcdbacb";
        maxFreq(str);
    }
    public static void maxFreq(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i < str.length() ;i++){
            char ch = str.charAt(i);

            if(map.containsKey(ch) == true){
                int cnum = map.get(ch);
                map.put(ch,cnum+1);
            }else{
                map.put(ch,1);
            }
        }

        char maxChar = 'a';
        int maxValue = 0 ;
        
        for(char c : map.keySet()){
            if(map.get(c) > maxValue){
            maxChar = c;
            maxValue = map.get(c);
            }
        }
        System.out.println(maxChar);
    }
}