public class A_12_removex {
     public static void main(String[] args){

        String str = " xabxdzz";
        System.out.println(removex(str));


     }
     public  static String removex(String str){

        if(str.length() == 0){
            return str;
        }
        String ans = "";
        if(str.charAt(0) != 'x'){
            ans = ans + str.charAt(0);
        }

        String smallans = removex(str.substring(1));
        return ans + smallans;

     }

}
