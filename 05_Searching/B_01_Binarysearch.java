public class B_01_Binarysearch{
    public static void main(String[] args){

       int [] arr = {-12,-4,0,20,23,67,87,89,95};
       int target = 20;
       int ans = binarysearch(arr, target);
       System.out.println(ans);

    }
    static int binarysearch(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end ){

        //    finding middle term :-
        //    int mid = (start + end )/ 2;  we can not do this in the case where we taking large size of array .
        //    it might exceeds the range of integer

        int mid = start + (end - start ) / 2;

        if(target < arr[mid]){
            end = mid -1;
        }
        else if(target > arr[mid]){
            start = mid +1;
        }
        else{
            return mid;
        }
        }
        return -1;
    }
}


// binary search in case of finding target first occrence in a duplicate array;

// static int binarysearch(int [] arr, int target){

//     int start = 0, end = arr.length - 1;

//     int ans = -1;

//     while(start <= end){
//         int mid = start + (end - start)/2;

//         if(arr[mid] == target){
//             ans = mid;
//             end = mid - 1; & in case of last occrence we change  here statr = mid + 1;
//             continue;
//         }
//         if(arr[mid] < target){
//             start = mid + 1;
//         }
//         else{
//             end = mid - 1;
//         }
//     }
//     return ans;
// }


// binary seacrh recursively in normal case:-

// static int findele_recurlsively(int start, int end, int[] arr, int target){
//     if(start < end) return -1;
//     int mid = (start + end) / 2;
//     if(arr[mid] == target) return mid;
//     if(arr[mid] > target)return findele_recurlsively(start, mid - 1, arr, target);
//     return findele_recurlsively(mid + 1, end, arr, target);

// }


// in the same way we find the last occerance .and using bothe the problem we find the no of occerence of target element as
// (l.o - f.o + 1 = total no of occerance of the target element)


// in the rotated sorted array any one part is sorted wrt the mid element .




