public class C_08 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            for(int j = 5; j >= i; j--){
                System.out.print("_");
            }
            for(int j = 6 - i; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i;j++){
                System.out.print("_");
            }
            for(int j = 1; j <= i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

/*
output:-

_____54321
____4321
___321
__21
_1
_1
__12
___123
____1234
_____12345


*/
