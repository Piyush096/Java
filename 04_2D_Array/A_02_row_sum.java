import java.util.Scanner;

public class A_02_row_sum {
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
        row_sum(array);

    }
    public static void row_sum(int[][] array){

        int rows = array.length;

        if(rows == 0){
            return;
        }

        int col = array[0].length;

        for(int i = 0; i < rows;i++){
            int sum = 0;
            for(int j = 0; j < col; j++){
                sum += array[i][j];
            }
            System.out.println(sum + " ");
        }

    }

}
