import java.util.Scanner;
import java.util.Arrays;
public class A_01_linearsearch{
    public static void main(String[] args){
        //Scanner in = new Scanner(System.in);
        int [] nums = {5, 23, 44, -4, 56, 34};
        int target = 44; 
        int ans = linearsearch(nums, target);
        System.out.println(ans);

    }
    static int linearsearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index = 0; index < arr.length; index++){
            //int element = arr[index];
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }

}
//here we have return the index , but we can also here return the true or false or the target value we find .
