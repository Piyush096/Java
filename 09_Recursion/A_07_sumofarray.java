import java.util.Scanner;

public class A_07_sumofarray {
    public static void main(String[] args){

        int [] arr = new int[] {1,4,5,6,7};
        System.out.println(sum(arr));

    }
    static int sum(int[] arr){
         return sum(arr, 0);

    }
    static int sum(int input[] , int startindex){
        if(startindex == input.length){
            return 0;
        }
        return input[startindex] + sum(input,startindex+1);
    }
}
