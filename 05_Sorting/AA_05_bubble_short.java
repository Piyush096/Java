import java.util.Scanner;
class AA_05_bubble_short{
    public static void main(String args[]){

        int temp;

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
        System.out.println("SORTED ARRAY IS:-");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
