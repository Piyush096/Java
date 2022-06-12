import java.util.Scanner;
public class AA_01_Bear_and_Big_Brother{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            int limak=0,bob=0,count=0;

        while(a<=b){

            limak = 3*a;
            bob = 2*b;

            count++;
            if(limak > bob){
                System.out.println(count);
                break;
            }
            else{
                a = limak;
                b = bob;

            }

        }

    }
}
// anoter approch

// import java.util.Scanner;
// public class AA_01_Bear_and_Big_Brother{
//     public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);
//             int a = sc.nextInt();
//             int b = sc.nextInt();

//             int count = 0;

//             while (a <= b)
//             {
//                 a *= 3;
//                 b *= 2;
//                 (count)++;
//             }

//             System.out.println(count);
//     }
// }
