import java.util.Scanner;

public class A_03_max_col_sum {
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
        System.out.println(col_sum(array));

    }
    static int  col_sum(int[][] array){

        int row = array.length;
        int col = array[0].length;

        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < col; i++){
            int sum = 0;
            for(int j = 0; j < row; j++){

                sum = sum + array[j][i];

            }
            if(sum > largest){
                largest = sum;
            }
        }

        return largest;
    }

}
