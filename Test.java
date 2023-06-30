import java.util.Scanner;
import Operators.*;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 positive numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("" + a + " + " + b + " = "+ MathOperators.add(a, b));
        System.out.println("" + a + " - " + b + " = "+ MathOperators.substract(a, b));
        System.out.println("" + a + " * " + b + " = "+ MathOperators.multiply(a, b));
        System.out.print("" + a + " / " + b + " = "+ MathOperators.divide(a, b));

        // System.out.print("" + a + " & " + b + " = "+ BitwiseOperators.and(a, b));
        // System.out.print("" + a + " | " + b + " = "+ BitwiseOperators.or(a, b));
        // System.out.print("" + a + " ^ " + b + " = "+ BitwiseOperators.xor(a, b));
    }
}
