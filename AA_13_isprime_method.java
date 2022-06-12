import java.util.Scanner;

class AA_13_isprime_method{
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
boolean ans = isprime(n);
        System.out.println(ans);
    }
    static boolean isprime(int n){
        if(n <= 1){
            return false;
        }
        int c = 2;
        while(c * c <= n){
            if (n % 2 == 0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }

}

