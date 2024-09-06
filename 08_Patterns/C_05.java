public class C_05 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("_");
			}
			for(int j = 4; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i < 5  ; i++) {
			for(int j = 1; j <= 5 - i; j++ ) {
				System.out.print("_");
			}
			for(int k = 4; k >= 1; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
    }
}

/*
output:-

_****
__****
___****
____****
_____****
_____****
____****
___****
__****
_****


*/
