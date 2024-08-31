import java.util.*;
public class AA_14_factor_of_no {
    public static void main(String[] args){
        if(prime(13)) {
            System.out.println("is prime no");
        } else {
            System.out.println("not prime");
        }
    }
    public static boolean prime(int number) {

        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
