import java.util.Arrays;
public class A_04_maxvalue_array{
    public static void main(String[] args){
        int[] arr ={1,2,23,9,8};
        System.out.println(max(arr));


    }
    static int max(int[] arr){
        int maxval= arr[0];
        int position = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > maxval){
                maxval = arr[i];
                position = i;
            }
        }
        System.out.println(position);
        return maxval;
    }
}
