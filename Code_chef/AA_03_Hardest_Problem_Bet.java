import java.util.Scanner;
class AA_03_Hardest_Problem_Bet{
    public static void main(String args[]){


        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();

          if(a < b && a < c)
          System.out.println("Draw");
          else if(b < a && b < c)
          System.out.println("Bob");
          else
          System.out.println("Alice");
        }
    }
}
