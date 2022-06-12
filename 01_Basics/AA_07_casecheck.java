import java.util.Scanner;
public class AA_07_casecheck{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        char ch = input.next().trim().charAt(0);
        System.out.println(ch);
        //The trim() method removes whitespace from both ends of a string and returns a new string, without modifying the original string.

        //The Java String class charAt() method returns a char value at the given index number. The index number starts from 0 and goes to n-1, where n is the length of the string.

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("lowecase");
        }
        else{
            System.out.println("uppercase");
        }
    }

}
