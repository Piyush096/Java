
import java.util.Scanner;
class AA_13_FBC{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

       int t = s.nextInt();

       while(t-- >0){
            int k = s.nextInt();
            int x = s.nextInt();


            if(k = x){
                System.out.println("0");
            }
            else{
                 System.out.println(k-x);
            }
       }
    }
}
