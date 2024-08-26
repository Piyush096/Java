public class reverse_String {
    public static void main(String[] args) {
        String s = "piyush";

        reverse_String(s);
    }
    public static void reverse_String(String s){
        char[] new_s = s.toCharArray();

        int left = 0;
        int right = new_s.length - 1;

        while (left < right) {
            char temp = new_s[left];
            new_s[left] = new_s[right];
            new_s[right] = temp;
            left++;
            right--;
        }

        String reverseString = new String(new_s);
        System.out.println("reverse of "+s+" is :- " + reverseString);
    }
}
