public class Convert_Uppercase {
    public static void main(String[] args) {
        String st = "ShiVaKuMar";
        UppercaseToLowercase(st);
    }

    public static void UppercaseToLowercase(String st){
        char[] s = st.toCharArray();

        for(int i = 0 ;i < s.length;i++){
            char ch = s[i];

            if(ch >= 'A' &&  ch<= 'Z'){
            char ansch =(char)( ch -'A' + 'a');
            s[i] = ansch;
           }
        }

        for(char si : s){
            System.out.print(si);
            //ans : sivakumar
        }
     }
}
