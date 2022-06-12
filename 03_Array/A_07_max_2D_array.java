import java.util.Arrays;
public class A_07_max_2D_array{
    public static void main(String[] args){
        int[][] arr = {
                            {23, 4, 21},
                            {18, 12, 3, 9},            // declaration of the 2d array
                            {78, 99, 34, 56},
                            {18,12}
                            };

        int ans = max_value(arr);

        System.out.println(ans);
    }
    static int max_value(int[][] arr){

        int max = Integer.MIN_VALUE;

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
