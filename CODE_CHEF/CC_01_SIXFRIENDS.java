import java.util.Scanner;
class CC_01_SIXFRIENDS{
    public static void main(String args[]){
        Scanner p = new Scanner(System.in);

        int t = p.nextInt();

        while(t-- > 0){
            int x = p.nextInt();
            int y = p.nextInt();

            if(x*3 <= 2*y){
                System.out.println(x*3);
            }
            else{
                System.out.println(y*2);
            }
        }
    }
}


// #include<stdio.h>
// int main(void){
//     int t;
//     while(t--){
//         int x,y;
//         if(x*3 <= 2*y){
//             printf("%d\n",x*3);
//         }
//         else{
//             printf("%d\n",y*2);
//         }
//     }
// }
