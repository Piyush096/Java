import java.util.Scanner;
class AA_19_COURSEREG{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while(t-- > 0){

            int n = s.nextInt();
            int m = s.nextInt();
            int k = s.nextInt();

            if(m >= n+k){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
