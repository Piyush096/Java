import java.util.Scanner;

public class A_06_quick_sort {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] input = new int [n];


        for(int i = 0; i < n; i++){

            input[i] = in.nextInt();
        }

        quick_sort(input);

        for(int i = 0; i < n; i++){

            System.out.println(input[i] + " ");
        }

    }
    static void quick_sort(int[] input){

        quick_sort(input, 0, input.length - 1);
    }
    static void quick_sort(int[] input, int si, int ei){

        if(si >= ei){
            return;
        }

        int partitionindex = partition(input, si, ei);
        quick_sort(input, si, partitionindex - 1);
        quick_sort(input, partitionindex + 1, ei);
 
    }
    static int partition(int[] input, int si, int ei){

        int pivot = input[si];

        int count = 0;

        for(int i = si + 1; i <= ei; i++){
            if(input[i] <= pivot){     //including  equal to the pivot element
                count++;
            }
        }
        int pivotindex = si + count;
        input[si] = input[pivotindex];
        input[pivotindex] = pivot;

        int i = si, j = ei;

        while(i < j){

            while(i <= ei && input[i] <= pivot){
                i++;
            }
            while(input[j] > pivot){
                j--;
            }
            if(i <= j){
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
                i++;
                j--;
            }
        }
        return pivotindex;
    }

}

