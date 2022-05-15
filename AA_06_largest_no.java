import java.util.Scanner;
public class AA_06_largest_no{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.print("enter the values of a, b & c:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // if(a > b && a > c)
        // System.out.println("larger is a = " + a);
        // else if(b > a && b > c )
        // System.out.println("larger is b = " + b);
        // else
        //  System.out.println("larger is c = " + c);


        // another way to solve the problem is:-

        // int max = a;
        // if (b > max){
        //     max = b;
        // }
        // if (c > max){
        //     max = c;
        // }

        // System.out.println("largest no. is = " + max);


        // this is also the another way to solve this question
        int max = Math.max(c,Math.max(a,b));
        System.out.println("largest no. is = " + max);

    }
}
