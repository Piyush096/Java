import java.util.Scanner;
class test2{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();

        while(x-- >0){
            int a = s.nextInt();
            int b = s.nextInt();

            if(a * 100 >= b * 10){
                System.out.println("CLOTH");
            }else{
                System.out.println("DISPOSABLE");
            }
        }
    }
}
