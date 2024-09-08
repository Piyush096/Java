public class C_11 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
			for(int j = 5 - i; j > 1 ; j--) {
				System.out.print("_");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
    }
}

/*
output:-

____*
___* *
__* * *
_* * * *
* * * * *

*/
