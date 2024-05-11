import java.util.Arrays;

public class A_03_insertion_sort{
    public static void main(String[] args){

        int [] arr = {3, 5, 2, 6, 1, 7};

        insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion_sort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j > 0; j--){

                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }

            }
        }
    }

    static void swap(int [] arr, int smaller_no, int larger_no){

        int temp = arr[smaller_no];
        arr[smaller_no] = arr[larger_no];
        arr[larger_no] = temp;
    }
}

// NOTE :-
// time complexit of selection sort is:-
// for worst case :- 0(N^2) & for best case :- 0(N)

// we uses this sorting beacuse it reduses the no of swaps. & it is stable.

//another approch of the problem:-
// this is the reason why iam switching another level of the random of the there should be another leve 
