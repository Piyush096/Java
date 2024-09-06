public class C_09 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            for(int j = 5; j >= i; j--){
                System.out.print("_");
            }
            for(int j = 0; j <= 5 - i; j++){
                System.out.print((char)('A' + j));
            }
            System.out.println();
        }
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i;j++){
                System.out.print("_");
            }
            for(int j = 0; j < i;j++){
                System.out.print((char)('A' + j));
            }
            System.out.println();
        }
    }
}

/*
output:-

_____ABCDE
____ABCD
___ABC
__AB
_A
_A
__AB
___ABC
____ABCD
_____ABCDE

*/
