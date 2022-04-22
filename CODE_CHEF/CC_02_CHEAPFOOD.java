import java.util.Scanner;
class CC_02_CHEAPFOOD{
    public static void main(String args[]){
        Scanner p = new Scanner(System.in);

        int t = p.nextInt();

        while(t-- > 0){
            int x = p.nextInt();

            if((x/10) >= 100){
                System.out.println((x/10));
            }
            else{
                System.out.println(100);
            }
        }
    }
}

// #include<stdio.h>
// int main(void){
//     int t;
//     while(t--){
//         int x;
//         if(x/10>= 100){
//             printf("%d\n",x/10);
//         }
//         else{
//             printf("%d\n",100);
//         }
//     }
// }
