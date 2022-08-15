import java.util.Scanner;

public class A_01_input_output {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("enter the value of the row");
        int row = in.nextInt();

        System.out.println("enter the value of the col");
        int col = in.nextInt();

        int[][] array = new int [row][col];


        System.out.println("enter the element of array");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){

                array[i][j] = in.nextInt();
            }
        }

        for(int i = 0; i < row; i++ ){
            for(int j = 0; j < col; j++){

                System.out.print(array[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

}


/*Exactly, what the array contains is object references, not the objects themselves.
Think of object references as being similar to long values that tell the JVM where the
object is elsewhere in memory (it's more complicated than that, but that's a useful mental model).
The object references are stored in the array's contiguous memory block. The objects are elsewhere,
and may or may not be stored in contiguous memory (probably not).

So for instance, say we have:

        int[] a = new int[] { 1, 2, 3 };

        In memory we'll get something like:

                       +−−−−−−−+
        a: Ref51234−−−>| int[] |
                       +−−−−−−−+
                       | 1     |
                       | 2     |
                       | 3     |
                       +−−−−−−−+

a contains a reference to the array, which is elsewhere in memory and has a contiguous data block containing 1, 2, and 3.


Now let's look at an object array (where the Example class stores the given constructor parameter as a private x field):

Example[] a = new Example[] { new Example(1), new Example(2), new Example(3) };

That might give us something like this:

               +−−−−−−−−−−−+          +−−−−−−−−−+
a: Ref51234−−−>| Example[] |     +−−−>| Example |
               +−−−−−−−−−−−+     |    +−−−−−−−−−+
               | Ref81372  |−−−−−+    | x: 1    |
               | Ref96315  |−−−−+     +−−−−−−−−−+
               | Ref12975  |−−+ |                   +−−−−−−−−−+
               +−−−−−−−−−−−+  | +−−−−−−−−−−−−−−−−−−>| Example |
                              |                     +−−−−−−−−−+
                              |                     | x: 2    |
                              |                     +−−−−−−−−−+
                              |   +−−−−−−−−−+
                              +−−>| Example |
                                  +−−−−−−−−−+
                                  | x: 3    |
                                  +−−−−−−−−−+

*/
