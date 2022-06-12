//  #include <stdio.h>
// int main(void)
// {
//     int t;
//     scanf("%d", &t);
//     while (t--)
//     {
//         int n;
//         scanf("%d", &n);
//         int arr[n+1], count = 0;
//         arr[0] = 0;
//         for (int i = 1; i <= n; i++)
//         {
//             scanf("%d", &arr[i]);
//         }
//         for (int i = 1; i < n; i++)
//         {
//             if (arr[i] > arr[i + 1])
//             {
//                 int z = arr[i];
//                 arr[i] = arr[i+1];
//                 arr[i+1] = z;
//                 count++;

//                 if (arr[i-1] > arr[i])
//                 {
//                     (count)++;
//                     break;
//                 }
//             }
//         }
//         if (count == 0 || count == 1)
//             printf("YES\n");
//         else
//             printf("NO\n");
//     }
// }
