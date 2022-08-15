public class B_03_ceilingno{
    public static void main(String[] args){

       int [] arr = {-12,-4,0,20,23,67,87,89,95};
       int target = 25;
       int ans = ceilingno(arr, target);
       System.out.println(ans);

    }
    static int ceilingno(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;

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
        return start;
    }
}
// ceiling no(lower bound) :-
// in a sorted aray and a target value the ciling of the target is the smallest element in array greater than or
// equal to the target .
