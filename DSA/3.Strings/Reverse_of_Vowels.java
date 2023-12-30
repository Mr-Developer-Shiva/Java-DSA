public class Reverse_of_Vowels {
    public static void main(String[] args){
        //Q) Given a string reverse all the vowels
        String str = "youcandoit";
        reverseVowels(str);
    }

    public static void reverseVowels(String str){
        char[] ch = str.toCharArray();

        int i = 0 ;
        int j = ch.length - 1;
        while(i < j ){
            while(ch[i] != 'a'&& ch[i] != 'e' && ch[i] != 'i' && ch[i] != 'o' &&  ch[i] !='u'){
                i++;
            }
            while(ch[j] !='a' && ch[j] != 'e' && ch[j] != 'i' && ch[j] != 'o' && ch[j] != 'u'){
                j--;
            }

            if(i >= j){
                break;
            }

            char s = ch[i];
            ch[i] = ch[j];
            ch[j] = s;
            i++;
            j--;
        }

        for(char c : ch){
            System.out.print(c);
        }
    }
} 
