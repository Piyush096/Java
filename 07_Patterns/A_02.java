import java.util.Scanner;
public class A_02{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter no of rows");
        int n = input.nextInt();

        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){

                System.out.print("*");
            }
             System.out.println();
        }
    }
}

/*output:-

n = 5

*****
*****
*****
*****
*****

*/
