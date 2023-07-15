import java.util.Scanner;
import java.util.Arrays;
class A_01_passingfun{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

       int [] ros;
       ros = new int[5];
       System.out.println();

      for(int i = 0; i < ros.length; i++){
        ros[i] = s.nextInt();
      }



      String pot= Arrays.toString(ros);
      System.out.print(pot);
//       change(ros);
//       System.out.print(Arrays.toString(ros));

//     }
//     static void change(int[] arr){
//         arr[0] = 99;
     }
 }
