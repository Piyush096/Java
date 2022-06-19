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
            //finding middle term
        //    int mid = (start + end )/ 2;  we can not do this in the case where we taking large size of array .it might exceeds the range of integer

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
