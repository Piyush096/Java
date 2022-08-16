import java.util.Scanner;

public class A_05_totalsum_boundries_diagonal {
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
        totalsum(array);

    }
    static int firstdiagonalsum(int[][] array, int dimension){

        int currrow = 0;
        int currcol = 0;

        int diagonalsum = 0;

        while(currrow < dimension && currcol < dimension ){

            diagonalsum += array[currrow][currcol];

            currrow += 1;
            currcol += 1;

        }
        return diagonalsum;
    }
    static int seconddiagonalsum(int[][] array , int dimension){

        int currrow = 0;
        int currcol = dimension - 1;

        int diagonalsum = 0;
        while(currrow < dimension && currcol >= 0){

            diagonalsum += array[currrow][currcol];
            currrow += 1;
            currcol -= 1;

        }
        return diagonalsum;

    }
    static int outerboundarysum(int[][] array, int dimension){

        int sum = 0;
        for(int i = 0; i < (array.length -1); i ++){
            sum += array[0][i]; // for upper side sum
            sum += array[array.length - 1][i]; // for lower side sum
            sum += array[i][0]; //left side sum
            sum += array[i][array.length - 1]; // for right side sum

        }
        return sum;
    }
    static void totalsum(int[][] array){
        int n = array.length;

        if(n == 0){
            return;
        }
        int totalsum = firstdiagonalsum(array, n) + seconddiagonalsum(array, n) + outerboundarysum(array, n);

        if(n % 2 != 0){
            totalsum -= array[n/2][n/2];
        }
        System.out.println(totalsum);
    }

}
