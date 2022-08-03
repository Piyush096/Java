public class A_09_first_index {
    public static void main(String[] args){

        // in this problem we basically find the first target element in the array else -1;

        int [] arr = new int[]{4, 5, 8, 3, 2};
        int x = 5;

        System.out.println(first_index(arr,x));
    }
    public static int first_index(int[] arr, int x){
        return first_index(arr,x,0);
    }
    public static int first_index(int[] arr, int x, int startindex){
        if(startindex == arr.length){
            return -1;
        }
        if(arr[startindex] == x){
            return startindex;
        }
        return first_index(arr, x, startindex + 1);
    }

}
