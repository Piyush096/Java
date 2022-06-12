import java.util.Scanner;
class AA_15_TYRE{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while(t-- >0){
            int x = s.nextInt();
            int y = s.nextInt();

            System.out.println(2*x + 4*y);

        }

    }
}
