import java.util.*;

class Demo {
    public static void main(String[] args){
        factor(13);
    }
    public static void factor(int number) {
        System.out.println("factor of " + number + " are: ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}


/*
 * // Trim leading and trailing spaces and split by one or more spaces
        String[] words = s.trim().split("\\s+");

        // Use StringBuilder to efficiently reverse the words
        StringBuilder reversed = new StringBuilder();

        // Iterate over the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" "); // Add space between words
            }
        }

        return reversed.toString();
 */
