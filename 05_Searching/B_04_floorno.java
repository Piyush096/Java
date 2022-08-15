public class B_04_floorno{
    public static void main(String[] args){

       int [] arr = {-12,-4,-1,0,20,23,67,87,89,95};
       int target = -1;
       int ans = floorno(arr, target);
       System.out.println(ans);
       if(ans ==  -1){
        System.out.println("no element found");
       }

    }
    static int floorno(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;

        if(target > arr[arr.length-1]){
            return -1;
        }

        while(start <= end ){

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
        return end;
    }
}
// floor no:-
// the floor is the greatest element in array smaller than or equal to target.
