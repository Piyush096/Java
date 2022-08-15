import java.util.Arrays;

public class A_median_of_two_sorted_array {
    public static void main(String[] args){

        int[] nums1 = {2, 4, 7};
        int[] nums2 = {1, 3, 8};

        System.out.println(merge_two_sortedarray(nums1, nums2));


      }
      public static double merge_two_sortedarray(int[] nums1, int[] nums2){

          int [] ans = new int[nums1.length + nums2.length];
          int i = 0, j = 0, k = 0;

          while(i < nums1.length && j < nums2.length){

              if(nums1[i] < nums2[j]){
                  ans[k] = nums1[i];
                  k++;
                  i++;
              }
              else{
                  ans[k] = nums2[j];
                  k++;
                  j++;
              }
          }
          while(i < nums1.length){
              ans[k] = nums1[i];
              k++;
              i++;
          }
          while(j < nums2.length){
              ans[k] = nums2[j];
              k++;
              j++;
          }
          if(ans.length % 2 == 0){
            return ans[(ans.length)/2];
          }
          double count = ans[((ans.length)/2) - 1] + ans[(ans.length) / 2];
          return count;
      } 
}
