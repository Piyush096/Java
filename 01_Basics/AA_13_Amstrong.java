import java.util.*;
public class AA_13_Amstrong {

    public static void main(String[] args) {
        amstrongNO(153);
    }

    public static void amstrongNO(int data) {
        int count = 0;
        int temp = data;

        // Counting the number of digits
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        // String.valueOf(data).length(); we do the count step in a single line;

        temp = data; // Resetting temp to the original value
        int sum = 0;

        // Calculating the sum of each digit raised to the power of the number of digits
        while (temp > 0) {
            int remainder = temp % 10;
            sum += Math.pow(remainder, count);
            temp = temp / 10;
        }

        // Checking if the sum is equal to the original number
        if (sum == data) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}


