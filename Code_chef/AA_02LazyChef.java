import java.util.Scanner;
 class AA_02LazyChef{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- >0){
            int x = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();

            if(x*m <= x+d)
            System.out.println(x*m);
            else
            System.out.println(x+d);


        }

    }
}
