import java.util.Arrays;



// NOTE :- 1) if range => [0 to N ]
//           every element will be at index = value

//         2) if range => [1 to N ] (if range/length of array is 8 then value is from 1 to 8 in the array.)
//           every element will be at index = value - 1.


public class A_04_cycle_sort{
    public static void main(String[] args){

        int[] arr = {3, 4, 5, 2, 1};

        cycle_sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cycle_sort(int[] arr){

        int i = 0;

        while(i < arr.length){

            int correct = arr[i] - 1;

            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int [] arr, int i, int correct){

        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}



//448

// class Solution {
//     public List<Integer> findDisappearedNumbers(int[] nums) {

//         void cycle_sort(int[] nums){

//             int i = 0;

//             while(i < nums.length){

//                 int correct = nums[i] - 1;

//                 if(nums[i] != arr[correct]){
//                     swap(nums, i, correct);
//                 }
//                 else{
//                     i++;
//                 }
//             }

//             List<Integer> ans = new ArrayList<>();

//             for(int index = 0; index < nums.length; index++){

//                 if(nums[index] != index + 1){

//                     ans.add(index + 1);
//                 }
//             }
//         }
//         return ans;

//     }
//     void swap(int [] nums, int i, int correct){

//         int temp = nums[i];
//         nums[i] = nums[correct];
//         nums[correct] = temp;
//     }
// }
