public class A_10_last_index {
    public static void main(String[] args){
        // in this programm we have to find the last index in an array .
        //Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
        int[] arr = new int[] {2, 4, 2, 8,4};

        int x = 2;

        System.out.println(last_index(arr, x));
    }
    static int last_index(int[] arr, int x){
        return last_index(arr, x, 0);
    }
    static int last_index(int[] arr, int x, int startindex){

        if(startindex == arr.length){
            return -1;
        }
        int smallans = last_index(arr, x, startindex + 1);
        if(smallans != -1){
            return smallans;
        }
        if(arr[startindex] == x){
            return startindex;
        }
        return -1;
    }
}
// in this we are checking the elements from the laset and the then return it the called function.
