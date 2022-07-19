import java.util.Scanner;
public class A_07{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for(int row = 1; row <= n; row++){

            int no_of_spaces = n - row;
            for(int s = 0; s < no_of_spaces; s++){
                System.out.print(" ");
            }


            for(int col =row; col >= 1; col--){

                System.out.print(col);
            }
            for(int col = 2 ; col <= row; col++){

                System.out.print(col);
            }


             System.out.println( );

        }
    }
}
