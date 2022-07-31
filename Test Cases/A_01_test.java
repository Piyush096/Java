import java.util.*;
import java.io.*;
import java.util.*;
public class A_01_test{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter length of sentance: ");
        n = input.nextInt();

        ArrayList<String> arrli
            = new ArrayList<String>(n);
        System.out.println("Enter sentance");
        for(int i = 0; i < n; i++)
        {
            String name;
            name = input.next();
            arrli.add(name);
        }

        // System.out.println(arrli.length);
        for(int i = 0; i < arrli.size();i++)
            System.out.print(arrli.get(i) + " ");

        // String[] s = new String[2];

        // for(int i = 0; i < s.length; i++){

        //     s[i] = input.next();
        // }

        // for(int i = 0; i< s.length; i++){

        //     System.out.print(s[i] + " ");

        // }



    }


}
