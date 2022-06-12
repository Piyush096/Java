import java.util.Scanner;
 class AA_01_PASSORFAIL{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int p = sc.nextInt();

            if((x*3)-(n-x)>= p)
            System.out.println("PASS\n");
            else
            System.out.println("FAIL\n");


        }

    }
}
