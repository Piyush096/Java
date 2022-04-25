import java.util.Scanner;
class AA_11_CABS{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

       int t = s.nextInt();

       while(t-- >0){
            int x = s.nextInt();
            int y = s.nextInt();

            if(x < y){
            System.out.println("FIRST");
            }
            else if(x > y){
            System.out.println("SECOND");
            }
            else{
            System.out.println("ANY");
            }
       }
    }
}
