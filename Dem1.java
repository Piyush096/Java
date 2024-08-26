public class Dem1 {
    public static void main(String[] args) {
        String s = "abc";
        checkPalindrome(s);
    }

    public static void checkPalindrome(String s) {
        String temp = s;
        char[] s1 = s.toCharArray();

        int left = 0;
        int right = s1.length - 1;  // Corrected to point to the last index

        // Reverse the character array
        while (left < right) {  // Fixed condition
            char temp1 = s1[left];
            s1[left] = s1[right];
            s1[right] = temp1;
            left++;  // Move towards the center
            right--; // Move towards the center
        }

        // Convert the reversed array back to a string
        String reversedString = new String(s1);

        // Check if the original string equals the reversed string
        if (temp.equals(reversedString)) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }
    }

}
