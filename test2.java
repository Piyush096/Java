import java.util.Scanner;
class test2{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            int x = s.nextInt();

            if(a == x || b == x || c == x){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }

    }
}
