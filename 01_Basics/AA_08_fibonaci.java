import java.util.Scanner;
public class AA_08_fibonaci{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1+" "+n2+" ");
        int count = 2;

        while(count <= n){
            int temp = n2;
            n2 = n1 + n2;
            n1 = temp;
            count ++;
        System.out.print(n2+" ");
        }
    }
}
