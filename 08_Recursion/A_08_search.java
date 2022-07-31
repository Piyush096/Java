public class A_08_search {
    public static void main(String[] args){

        int[] arr = new int[]{4,5,3,7,8};
        //int target = 3;

        System.out.println(search(arr,8));
    }
    static boolean search(int[] arr, int target){
        return search(arr, target,0);
    }
    static boolean search(int[] arr, int target, int startindex){
        if(startindex == arr.length){
            return false;
        }
        if(arr[startindex] == target){
            return true;
        }
        return search(arr, target, startindex + 1);

    }
}
