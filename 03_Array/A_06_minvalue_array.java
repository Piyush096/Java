import java.util.Arrays;
public class A_06_minvalue_array{
    public static void main(String[] args){
        int[] arr ={11,2,23,9,8};
        System.out.println(min(arr));

    }
    static int min(int[] arr){
        int minval= arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < minval){
                minval = arr[i];
            }
        }
        return minval;
    }
}

