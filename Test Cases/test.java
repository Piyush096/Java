import java.util.Scanner;
import java.util.Arrays;

public class test{
    public static void main(String [] args){

    Scanner input = new Scanner(System.in);
    String [] symbols = new String[4];

    int x = 0;

    for(int i = 0; i< 4; i++){
        symbols[i] = input.next();

        if((symbols.equal(new String("X++"))) || (symbols.equal(new String("++X")))){
           x = x + 1;
        }
        else if((symbols.equal(new String("X--"))) || (symbols.equal(new String("--X")))){
            x = x - 1;
        }

    }
        // String pot= Arrays.toString(symbols);
        // System.out.print(pot);
        System.out.println(x);
}

}
