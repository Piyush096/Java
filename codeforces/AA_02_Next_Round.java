import java.util.Scanner;
public class AA_02_Next_Round{
    public static void main(String args[]){
        Scanner p = new Scanner(System.in);

        int count = 0;

        int n = p.nextInt();
        int k = p.nextInt();

        int arr[];
        arr = new int [n];


        for(int i = 0; i < n; i++ ){
           arr[i]=p.nextInt();
        }


        for(int j = 0; j < n; j++){
            if(arr[j] >= arr[k-1] & arr[j] > 0)
            count ++;

        }
        System.out.println(count);
    }
}
