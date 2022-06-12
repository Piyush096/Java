import java.util.Scanner;
class AA_04_array_input{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[]= new int[n];

        System.out.println("enter array elements:-");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("array is:-");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");

        }
            System.out.println();
    }
}
