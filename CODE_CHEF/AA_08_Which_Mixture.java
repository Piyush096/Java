import java.util.Scanner;
class AA_08_Which_Mixture{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int T = s.nextInt();

        while(T -- > 0){
            int A = s.nextInt();
            int B = s.nextInt();

            if(A > 0 && B > 0){
            System.out.println("solution\n");
            }
            else if(B == 0 ){
            System.out.println("solid\n");
            }
            else{
            System.out.println("liquid\n");
            }
        }
    }
}
