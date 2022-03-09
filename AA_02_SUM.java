import java.util.Scanner;
public class AA_02_SUM
{
    public static void main(String[] args)
    {
        //System.out.print("value of a is ");
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        scan.nextLine();
        String str = scan.nextLine();

        System.out.println(i);
        System.out.println(str);

        scan.close();

        /*A stream kept open, can sometimes stay opened until the kernel decides to close it
        (like,after the program has completed execution... highly implementation dependent).
         Hence its a good idea to close the resource explicitly.*/
    }
}
/*
* The Java Scanner class breaks the input into tokens using a delimiter that is
whitespace by default

*we can take the input of primitive types from the user by :-  Scanner var_name = new Scanner(System.in); ,
the class(scanner) comes under the pacakage( predefined function in c) :- import java.util.Scanner;scan
In order to use scanner we have to write this import statement at the top –import java.util.Scanner;

*after that we have to initilize it in a variable of data type we want to take
ex :-  Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
    *The "next" method gets the string of text that a user enters on the keyboard.

*   Sample Input:
    10 5
    Output:
    15

*Here in the above program , s.nextInt() scans and returns the next token as int. A token is part of
entered line that is separated from other tokens by space, tab or newline. So
when input line is: “10 5” then s.nextInt() returns the first token i.e. “10” as int
and s.nextInt() again returns the next token i.e. “5” as int.

*we can take in this way as discussed scan.nextInt/double/....(),

*scince if we not add line no 10(scan.nextline),
we cant access the value of the string because the scan.nextInt(int,float,double,short...) method does not
read the newline(\n){integer,float... all the not read any whitespace/\t...}character in input created by
hitting "ENTER"/"SPACE",and so the call to scan.nextline returns after reading the new line.




*/
