import java.util.Scanner;


public class A_05_merge_sort {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);


        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++){
            array[i] = in.nextInt();
        }

        System.out.println("Before sorting array is :");
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");

        merge_sort(array);
        System.out.println("after sorting sorting array is :");
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }

    }
    static void merge_sort(int[] array){

        if(array.length <= 1){
            return;
        }
        int mid = array.length /2;
        int part1[] = new int [mid];
        int part2[] = new int [array.length - mid];

        for(int i = 0; i < mid; i++){
            part1[i] = array[i];
        }

        int k = 0;
        for(int i = mid; i < array.length; i++){

            part2[k] = array[i];
            k++;
        }

        merge_sort(part1);
        merge_sort(part2);

        merge(part1, part2, array);
    }

    static void merge(int input1[], int input2[], int output[]){

        int i = 0, j = 0, k = 0;

        while(i < input1.length && j < input2.length){

            if(input1[i] < input2[j]){
                output[k] = input1[i];
                k++;
                i++;
            }
            else{
                output[k] = input2[j];
                k++;
                j++;
            }
        }
        while(i < input1.length){
            output[k] = input1[i];
            k++;
            i++;
        }
        while(j < input2.length){
            output[k] = input2[j];
            k++;
            j++;
        }

    }

}


// import java.util.Scanner;


// public class A_05_merge_sort{
//     public static void main(String[] args){

//         int [] array = {6, 5, 4, 2};

//         merge_sort(array, 0, 3 );

//         for(int j = 0; j < 4; j++){
//             System.out.print(array[j] + " ");
//         }

//     }
//     static void merge_sort(int[]array, int si, int ei){

//         if(si >= ei){
//             return;
//         }

//         int mid = (si + ei)/2;

//         merge_sort(array, si, mid);
//         merge_sort(array, mid + 1, ei);

//         merge(array, si, ei);

//     }
//     static void merge(int[] input, int si, int ei){

//         int size = ei - si + 1;
//         int mid = (si + ei)/2;

//         int[] out = new int[size];

//         int i = si;
//         int j = mid + 1;
//         int k = 0;

//         while(i <= mid && j <= ei){

//             if(input[i] < input[j]){

//                 out[k] = input[i];
//                 i++;
//                 k++;
//             }
//             else{
//                 out[k] = input[j];
//                 j++;
//                 k++;
//             }
//         }
//         while(i <= mid){

//             out[k] = input[i];
//             i++;
//             k++;
//         }
//         while(j <= ei){

//             out[k] = input[j];
//             j++;
//             k++;
//         }
//         int m = 0;

//         for(int s = si; s <= ei; s++){

//             input[s] = out[m];
//             m++;

//         }
//     }

// }
