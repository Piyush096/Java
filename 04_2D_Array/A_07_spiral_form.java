import java.util.Scanner;

public class A_07_spiral_form {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("enter the value of the row");
        int row = in.nextInt();

        System.out.println("enter the value of the col");
        int col = in.nextInt();

        int[][] array = new int [row][col];


        System.out.println("enter the element of array");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){

                array[i][j] = in.nextInt();
            }
        }

        spiral_form(array);

    }
    static void spiral_form(int[][] array){

        int nrow = array.length;
        int ncol = array[0].length;

        if(nrow == 0){
            return;
        }

        int i, row_start = 0, col_start = 0, count = 0;

        int noelements = nrow * ncol;

        while(count < noelements){

            for(i = col_start; count < noelements && i < ncol; ++i){
                System.out.println(array[row_start][i]+ " ");
                count++;
            }
            row_start++;

            for(i = row_start; count < noelements && i < nrow; ++i){
                System.out.println(array[i][ncol - 1]+ " ");
                count++;
            }
            ncol--;

            for(i = ncol - 1; count < noelements && i >= col_start; --i){
                System.out.println(array[nrow - 1][i]+ " ");
                count++;
            }
            nrow--;

            for(i = nrow - 1; count < noelements && i >= row_start; --i){
                System.out.println(array[i][col_start] + " ");
                count++;
            }
            col_start++;
        }
    }

}


