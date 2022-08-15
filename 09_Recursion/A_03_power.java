import java.util.Scanner;

public class A_03_power {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int n = in.nextInt();

        System.out.println(power(x,n));

    }
    static int power(int x, int n){

        if(x == 0 && n == 0){
            return 1;
        }
        if( x == 0){
            return 1;
        }

        if(n == 0){
            return 1;
        }
        return x * power(x,n-1);

    }
}
