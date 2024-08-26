
class Demo {
    public static void main(String[] args) {
        String s = "aba";

        // reversestring(s);
        palindrome_check(s);
    }
    public static void palindrome_check(String s){
        String s1 = s;
        char[] new_s = s.toCharArray(); // using this we convert the string into the char of array;

        int left = 0;
        int right = new_s.length - 1;

        while (left < right) {
            char temp = new_s[left];
            new_s[left] = new_s[right];
            new_s[right] = temp;
            left++;
            right--;

        }
        String reversedString = new String(new_s);
        if(s1.equals(reversedString)){
            System.out.println("True");
        } else {
            System.out.println("False");
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
