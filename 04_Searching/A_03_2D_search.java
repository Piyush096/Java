import java.util.Arrays;
public class A_03_2D_search{
    public static void main(String[] args){
        int[][] arr = {
                            {23, 4, 21},
                            {18, 12, 3, 9},            // declaration of the 2d array
                            {78, 99, 34, 56},
                            {18,12}
                            };
        int target = 34;
        int[] ans = search(arr,target);  // format of the return value {row, col}
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row, col};  // here the array is not initiallized thats why we added new and int[]{ }; is the declaration of the array.
                }
            }
        }
        return new int[]{-1, -1};
    }
}
