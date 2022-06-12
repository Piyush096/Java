import java.util.Scanner;
class AA_05_THE_PREPRATION{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T-- > 0){
            int M = sc.nextInt();
            int N = sc.nextInt();
            int K = sc.nextInt();

            if(K * N < M)
            System.out.println("YES\n");
            else
            System.out.println("NO\n");
        }
    }
}
