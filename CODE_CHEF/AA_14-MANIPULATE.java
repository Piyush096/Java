import java.util.Scanner;
class AA_14_MANIPULATE{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

       int t = s.nextInt();

       while(t-- >0){
            int x = s.nextInt();
            int y = s.nextInt();


            if(x >= y){
                System.out.println("YES");
            }
            else{
                 System.out.println("NO");
            }
       }
    }
}
