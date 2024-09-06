public class C_07 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
			for(int j = 1; j<= 6 - i; j++) {
				System.out.print("_");
			}
			for(int j = 1; j<= 6 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("_");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
    }
}

/*
output:-

_____*****
____****
___***
__**
_*
_*
__**
___***
____****
_____*****


*/
