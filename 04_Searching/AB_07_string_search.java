import java.util.Arrays;
public class AB_07_string_search{
    public static void main(String[] args){
        String name = "piyush";
        char target = 'u';
        System.out.println(search(name,target));

    }
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;

    }
}
