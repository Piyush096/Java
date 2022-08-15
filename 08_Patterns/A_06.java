import java.util.Scanner;
public class A_06{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for(int row = 0; row < 2 * n; row++){
            int temp = row > n ? 2 * n - row : row;

            int no_of_spaces = n - temp;
            for(int s = 0; s < no_of_spaces; s++){
                 System.out.print(" ");
            }

            for(int col = 0; col < temp; col++){

                System.out.print("* ");

            }

            System.out.println( );

        }
    }
}
