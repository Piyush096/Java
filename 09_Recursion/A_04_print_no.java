import java.util.Scanner;

public class A_04_print_no {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        print_no(n);
    }
    static void print_no(int n){

        if(n == 1){
            System.out.print(n+ " ");
            return;
        }
        print_no(n - 1);
        System.out.print(n +" ");
    }
}

/*here we also solve this problem using i + 1*/
