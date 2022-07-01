import java.util.Arrays;

public class A_02_selection_sort{
    public static void main(String [] args){

        int [] arr = {3, 1, 5, 4, 2};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection_sort(int[] arr){

        for(int i = 0; i < arr.length; i++){

            int last = arr.length-1-i;

            int max_index = getmax_index(arr,0,last);
            swap(arr, max_index, last);
        }
    }
    static int getmax_index(int[] arr, int start, int end){
        int max = start;

        for(int i = start; i <= end; i++){

            if(arr[max] < arr[i]){
               max = i;
            }
        }
        return max;
    }
    static void swap(int [] arr, int max_index, int last){

        int temp = arr[max_index];
        arr[max_index] = arr[last];
        arr[last] = temp;
    }
}
