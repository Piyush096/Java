import java.util.Scanner;

// public class A_02_searching_char {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();

//         int[] hash = new int[26];

//         for (int i = 0; i < s.length(); i++) {
//             hash[s.charAt(i) - 'a']++;
//         }

//         int q = sc.nextInt();
//         while (q-- > 0) {
//             char x = sc.next().charAt(0);
//             System.out.println(hash[x - 'a']);
//         }
//     }
// }
public class A_02_searching_char {
    static int NO_OF_CHARS = 256;

    static void printDistinct(String str)
    {

        int[] count = new int[NO_OF_CHARS];

        for (int i = 0; i < str.length(); i++){

            if(str.charAt(i)!=' ')
            count[(int)str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++){
            if (count[(int)str.charAt(i)] > 1)
                System.out.print(str.charAt(i));

        }
        System.out.println();

    }
    public static void main(String args[])
    {
        String str = "GeeksforGeeks";
        printDistinct(str);
    }
}

int hash_function(char a)
{
    return a - 'a';
}
