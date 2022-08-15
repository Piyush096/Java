import java.util.Scanner;
public class A_05{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for(int row = 0; row < 2 * n; row++){
            // for every row, run the col
            int temp = row > n ? 2 * n - row : row;

            for(int col = 0; col < temp; col++){

                System.out.print("* ");

            }

            System.out.println( );

        }
    }
}
