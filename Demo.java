import java.util.*;

class Demo {
    public static void main(String[] args){

            for(int i = 1; i<= 5; i++) {
            for (int j = 5 - i; j >= 1; j--) {
            System.out.print("_");
            }
            for (int k=1; k <= i; k++) {
            System.out.print("*");
            }
            System.out.println();
            }

    }
}
