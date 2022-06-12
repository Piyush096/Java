import java.util.Scanner;
import java.util.Arrays;
class AB_01_passingfun{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

       int [] ros;
       ros = new int[5];

      for(int i = 0; i < ros.length; i++){
        ros[i] = s.nextInt();
      }
      System.out.print(Arrays.toString(ros));
      change(ros);
      System.out.print(Arrays.toString(ros));

    }
    static void change(int[] arr){
        arr[0] = 99;
    }
} 
