import java.util.Scanner;
class AA_25_PRESENTS{
    public static void main(String args[]){


        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

          if(n < 5){
            System.out.println(n);
          }
          else{
            System.out.println(n-n/5);
          }
        }

    }
}
