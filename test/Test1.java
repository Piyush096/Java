import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
//smallest element from right;

public class Test1 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};

        //transpose of matrix
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // reversing of matrix
        for(int i = 0; i < arr.length; i++){
            int start = 0;
            int end = arr.length - 1;

            while (start < end ) {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }
        
        //printing of 2D array
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}


/*
 String temp = "I LOVE INDIA";

        String[] temp1 = temp.split("\\s");

        for(int i = temp1.length - 1; i >= 0; i--) {
            System.out.print(temp1[i] + " ");
        }
 */
