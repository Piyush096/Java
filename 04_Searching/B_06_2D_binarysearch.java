import java.util.Arrays;

public class B_06_2D_binarysearch{
    public static void main(String[] arags){

        int [][] arr = {{10, 20, 30, 40},
                        {15, 25, 35, 45},
                        {28, 29, 37, 49},
                        {33, 34, 38, 50}};

        //int target = 39

        // System.out.println(Arrays.toString(search(arr,37)));

        // int[] position = new int[2];
        // position = search(arr, 37);

        // System.out.println("Element found at row " + position[0] + " and column " + position[1]);

        System.out.println(Arrays.toString(search(arr, 30)));


    }

    // this logic is used when the 2d array is strictly increasing or decreasing order in row and coloumn wise.
    static int[] search(int[][] nums , int target){

        int row = 0;
        int coloumn = nums.length - 1;

        while(row < nums.length && coloumn >= 0){

            if(nums[row][coloumn] == target){
                return new int[]{row, coloumn};
            }
            if(nums[row][coloumn] < target){
                row++;
            }
            else{
                coloumn--;
            }
        }
        return new int[]{-1, -1};
    }

}
