import java.util.Scanner;

public class A_02_sumof_naturalno {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(sum(n));
    }
    static int sum(int n){

        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    }
}
