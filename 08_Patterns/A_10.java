public class A_10 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print((char)('A' + j) + "  ");
			}
			System.out.println();
		}
    }
}

/*
output

A
A  B
A  B  C
A  B  C  D
A  B  C  D  E

 */
