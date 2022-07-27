import java.util.Scanner;

public class A_01_factorial {
    public static void main(String [] args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int result = factorial(n);

        System.out.println(result);
    }
    static int factorial(int n){

        if(n == 0){

            return 1;
        }


        return n * factorial(n - 1);

    }

}
