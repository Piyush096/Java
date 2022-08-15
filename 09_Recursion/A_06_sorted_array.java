public class A_06_sorted_array {
    public static void main(String[] args){

        int [] arr = new int[]{2,1,3,5};

        System.out.println(sorted(arr));


    }
    static boolean sorted(int arr[]){

        if(arr.length <= 1){
            return true;
        }
        if(arr[0] > arr[1]){
            return false;
        }

        int [] small_arr = new int[arr.length - 1];

        for(int i = 1; i < arr.length - 1; i++){

            small_arr[i - 1] = arr[i];
        }

        boolean smallans = sorted(small_arr);
        return smallans;
    }
}
