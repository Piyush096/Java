import java.util.Scanner;
public class AA_10_reverseno{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        int rem = 0;
        
        while( num > 0){

        rem = rem * 10 + num % 10;
        num = num / 10;

        }
        System.out.println(rem);
    }
}
