public class palindrome_check {
    public static void main(String[] args) {
        String s = "aba";
        checkPalindrome(s);
    }

    public static void checkPalindrome(String s) {
        String temp = s;
        char[] s1 = s.toCharArray();

        int left = 0;
        int right = s1.length - 1;

        while (left < right) {
            char temp1 = s1[left];
            s1[left] = s1[right];
            s1[right] = temp1;
            left++;
            right--;
        }
        String reversedString = new String(s1);

        if (temp.equals(reversedString)) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }
    }
}
