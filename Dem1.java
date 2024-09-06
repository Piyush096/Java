import java.util.Arrays;
import java.util.Scanner;

public class Dem1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 6 - i; j++){
                System.out.print(j);
            }
            for(int k = 1; k < i; k++){
                System.out.print(" ");
            }for(int j = 1; j < i; j++){
                System.out.print(" ");
            }
            for(int k = 6 - i; k >= 1; k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
/*OUTPUT

1234554321
1234  4321
123    321
12      21
1        1

*/
