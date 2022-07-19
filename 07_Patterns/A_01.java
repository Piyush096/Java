import java.util.Scanner;
public class A_01{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for(int row = 1; row <= n; row++){
            // for every row, run the col
            for(int col = 1; col <= row; col++){

                System.out.print("*");
            }

             System.out.println( );

        }
    }
}
// output:-
/* n=5
*
**
***
****
*****
 */

// 1) no of lines = no of rows = no of outer loop will run.

// 2) identify for every row no,
    //  how many col are there.
    //  types of element in col.

// 3)what we want to print.
