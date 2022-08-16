import java.util.Scanner;

public class A_04_max_row_col_sum {
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

        System.out.println("max_row_sum is = " + max_row_sum(array));
        System.out.println("max_col_sum is = " + max_col_sum(array));


    }
    static int max_row_sum(int[][] array){

        int row = array.length;
        int col = array[0].length;

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < row; i++){
            int sum = 0;
            for(int j = 0; j < col; j++){

                sum += array[i][j];
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;

    }
    static int max_col_sum(int[][] array){

        int row = array.length;

        int col = array[0].length;

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < col; i++ ){
            int sum = 0;
            for(int j = 0; j < row; j++){

                sum = sum + array[j][i];

            }
            if(sum > max){
                max = sum;
            }
        }
        return max;

    }

}
