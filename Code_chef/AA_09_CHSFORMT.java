import java.util.Scanner;
class AA_09_CHSFORMT{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

       int t = s.nextInt();
       while(t-->0){
            int a = s.nextInt();
            int b = s.nextInt();

            if(a+b < 3){
            System.out.println("1");
            }
            else if(a+b >= 3 && a+b <= 10){
            System.out.println("2");
            }
            else if(a+b >= 11 && a+b <= 60){
            System.out.println("3");
            }
            else{
            System.out.println("4");
            }

       }
    }
}
