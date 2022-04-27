import java.util.Scanner;
  class AA_22_WATERCOOLER
  {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while(t-- > 0)
        {

            int x = s.nextInt();
            int y = s.nextInt();
            int m = s.nextInt();

            if((x *m) < (y))
            {
                System.out.println("YES");
            }
            else if ((x *m) >= (y))
                System.out.println("NO");
            
        }
    }
}
