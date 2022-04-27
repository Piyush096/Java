import java.util.Scanner;
class AA_21_CHEFCHOCO{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while(t-- > 0){

            int c = s.nextInt();
            int x = s.nextInt();
            int y = s.nextInt();

            System.out.println((c-x)*y);



        }
    }
}
