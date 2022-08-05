public class A_13_replace_char {
    public static void main(String[] args){

        String str = "abaabcda";

        System.out.println(replace(str));

    }
    public static String replace(String str){
        if(str.length() == 0){
            return "";
        }

        char c;
        if(str.charAt(0) == 'a'){
            c = 'x';
        }
        else{
            c = str.charAt(0);
        }

        String ans = replace(str.substring(1));
        return(c + ans);
    }
}
