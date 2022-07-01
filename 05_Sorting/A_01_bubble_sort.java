import java.util.Scanner;
import java.util.Arrays;

class A_01_bubble_sort{
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int arr[] = new int[n];

        System.out.println("ENTER THE ELEMENTS OF ARRAY:-");
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }

        System.out.println("ELEMENTS OF ARRAY:-");
        for(int i = 0; i < arr.length; i++){

            System.out.print(arr[i]+" ");
            System.out.println();
        }
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble_sort(int [] arr){

        int temp;

        for(int i = 0; i < arr.length-1; i++){

            int count = 0;
            for(int j = 0; j < arr.length-1-i; j++){

                if(arr[j] > arr[j+1]){

                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    count++;

                }
            }
            if(count == 0)
            break;
        }
    }
}
