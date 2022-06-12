// #include<stdio.h>
// int main(void)
// {
//     int t ;
//     scanf("%d",&t);

//     while(t--)
//     {
//         int a,b;
//         scanf("%d %d",&a,&b);

//         if((10*a) > (5*b))
//         printf("FIRST");
//         else if((10*a) < (5*b))
//         printf("SECOND");
//         else
//         printf("ANYONE");
//     }
// }

import java.util.Scanner;
class CC_03_SST{
    public static void main(String args[]){
        Scanner p = new Scanner(System.in);

        int t = p.nextInt();

        while(t-- > 0){
            int a = p.nextInt();
            int b = p.nextInt();

            if((10*a) > 5*b){
                System.out.println("FIRST\n");
            }
            else if((10*a) < (5*b)){
                System.out.println("SECOND\n");
            }
            else{
                System.out.println("ANY\n");
            }
        }
    }
}
