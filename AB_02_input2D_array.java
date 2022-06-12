import java.util.Scanner;
import java.util.Arrays;
public class AB_02_input2D_array{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int [][] arr = new int [3][3];

        //for input
        for(int row = 0; row < arr.length; row++ ){
            for(int col = 0; col < arr[row].length; col++){
               arr[row][col] = in.nextInt();

            }
        }

        //for output
        // for(int row = 0; row < arr.length; row++ ){
        //     for(int col = 0; col < arr[row].length; col++){

        //        System.out.print(arr[row][col]+" ");

        //     }
        //     System.out.println();
        // }


        //another way to print the output:-
        // for(int row = 0; row < arr.length; row++ ){
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        //one more way to print the output the output:-
        for(int[] a : arr ){ 
            System.out.println(Arrays.toString(a));
        }



    }

}
