import java.util.Scanner;
public class AA_09_counting{
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        System.out.print("enter the number=");
        int num = in.nextInt();

        System.out.print("value to find =");
        int target = in.nextInt();

        int count=0,flag;

        while(num > 0){
        flag = num % 10;
        if(flag == target)
        count++;

        num = num/10;
        }
        System.out.println(count);
    }
}
