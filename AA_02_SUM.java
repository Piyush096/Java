import java.util.Scanner;
public class AA_02_SUM
{
    public static void main(String[] args)
    {
        //System.out.print("value of a is ");
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        //System.out.print("value of b is ");
        int j = scan.nextInt();

        int k = i + j;
        System.out.println(k);

    }
}
/*
*we can take the input of primitive types from the user by :-  Scanner var_name = new Scanner(System.in); ,after that we create an object.
the class(scanner) comes under the pacakage( predefined function in c) :- import java.util.Scanner;

*after that we have to initilize it in a variable of data type we want to take
ex :-  Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
    *The "next" method gets the string of text that a user enters on the keyboard.

in this example first we take the value from the user and stored it in the variable of int type .
we can also store

*/
