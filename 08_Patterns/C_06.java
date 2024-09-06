public class C_06 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("_");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i < 5  ; i++) {
			for(int j = 1; j <= 5 - i; j++ ) {
				System.out.print("_");
			}
			for(int k = 1; k <= 5 - i ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
    }
}

/*
output:-

_*
__**
___***
____****
_____*****
____****
___***
__**
_*

*/
