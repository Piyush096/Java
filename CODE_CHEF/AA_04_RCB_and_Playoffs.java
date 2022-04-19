import java.util.Scanner;
class AA_04_RCB_and_Playoffs{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T-- > 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();

            if(X + 2 * Z >= Y)
            System.out.println("YES\n");
            else
            System.out.println("NO\n");
        }
    }
}
// if in this problem the only condition is if rcb wins rest all the matches(Z),Then he gets 2 credit ponts (Z * 2).
// alredy the team earned X points then for qualify for the playoffs team must it must satisfy (X + 2 * Z) >= Y. 
