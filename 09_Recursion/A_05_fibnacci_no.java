import java.util.Scanner;

public class A_05_fibnacci_no {
    public static void main(String [] args){

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(fibo(n));

    }
    static int fibo(int n){

        if(n == 0 || n ==1){
            return n;
        }
        return fibo(n -1) + fibo(n - 2);
    }
}
