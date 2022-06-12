
import java.util.Scanner;
class AA_12_VOLCONTROL{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

       int t = s.nextInt();

       while(t-- >0){
            int x = s.nextInt();
            int y = s.nextInt();

            if(x < y){
            System.out.println(y-x);
            }
            else if(x > y){
            System.out.println(x-y);
            }
       }
    }
}
