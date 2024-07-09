/**
 * test1
 */
public class test1 {
   public static void main(String[] args) {
      // int n = 5;

      // for(int i = 1; i <= n - 1; i++){
      //    for(int s = 1; s<= n- i; s++){
      //       System.out.print(" ");
      //    }
      //    for(int j = 1; j <= i *2 - 1; j++){
      //       System.out.print("*");
      //    }
      //    System.out.println();
      // }
      // for(int i = n; i >= 1; i--){
      //    for(int s = 1; s<= n- i; s++){
      //       System.out.print(" ");
      //    }
      //    for(int j = 1; j <= i *2 - 1; j++){
      //       System.out.print("*");
      //    }
      //    System.out.println();
      // }

      System.out.println(prime(13));
   }
   static boolean prime(int n){
      if(n <= 1){
         return false;
      }
      for(int i = 2; i < Math.sqrt(n); i++){
         if(n % i == 0){
            return false;
         }
      }
      return true;
   }

}
