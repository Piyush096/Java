public class B_02_orderAgnostic_Binarysearch{
    public static void main(String [] args){

      int [] arr = {20,23,67,87,89,95};
       int target = 67;
       int ans = orderAgnostic_binarysearch(arr, target);
       System.out.println(ans);


    }
    static int orderAgnostic_binarysearch(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;

        // find wether the aray is sorted in ascending or descending

        boolean isAsc = arr[start] < arr[end];

        while(start <= end ){

        int mid = start + (end - start ) / 2;

        if(target == mid){
            return mid;
        }
         if(isAsc){

        if(target < arr[mid]){
            end = mid -1;
        }
        else{
            start = mid +1;
        }
        }
        else{

        if(target > arr[mid]){
            end = mid -1;
        }
        else{
            start = mid +1;
        }
        }
        }
        return -1;
    }
}
