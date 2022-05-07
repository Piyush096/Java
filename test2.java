import java.util.Scanner;
class test2{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();

        while(x-- >0){
            int x = s.nextInt();
            int y = s.nextInt();
            int z = s.nextInt();

            if(x+y <= z){
            System.out.println("2");
            }
            else if(x+y >= z && x <= z){
            System.out.println("1");
            }
             else if(x+y >= z){
            System.out.println("0");
            }



        }
    }
}
