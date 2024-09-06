public class C_03 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("_");
			}
			for(int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
    }
}

/*
output:-

_*****
__*****
___*****
____*****
_____*****

 */
