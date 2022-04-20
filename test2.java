import java.util.Scanner;
class test2{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T-- > 0){

            int N = sc.nextInt();
            int K = sc.nextInt();

            if(K == 0){

                if(N % 4 == 1 || N % 4 == 2 || N % 4 == 3)
                System.out.println("ON\n");
                else
                System.out.println("OFF\n");
            }
            else{

                if(K == 1){
                    if(N % 4 == 0)
                    System.out.println("ON\n");
                    else
                    System.out.println("AMBIGUOUS\n");
                }
            }


        }

    }
}

