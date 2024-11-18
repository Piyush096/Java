import java.util.ArrayList;

public class Method {
    public static void main(String args[]) {
        int[] arr = {4, 1, 1, 1, 2, 3, 5};
        int k = 5;
        int sum = 0;
        int j = 0;
        int i = 0;
        int max = 0;

        while (j < arr.length) {
            sum = sum + arr[j];

            if(sum < k){
                j++;
            }

            else if(sum == k){
                max = Math.max(max, j- i + 1);
                j++;
            }
            else if(sum > k){
                while(sum > k){
                    sum = sum - arr[i];
                    i++;
                }
                j++;
            }
        }
        System.out.println(max);
    }
}
