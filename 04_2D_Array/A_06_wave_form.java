import java.util.Scanner;

public class A_06_wave_form {
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
        wave_form(array);

    }
    static void wave_form(int [][] array){

        if(array.length == 0){
            return;
        }

        for(int j = 0; j < array[0].length; j++){

            if(j % 2 == 0){
                for(int i = 0; i < array.length; i++){

                    System.out.print(array[i][j] + " ");
                }
            }
            else{
                for(int i = array.length -1; i >= 0; i--){
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }

}
