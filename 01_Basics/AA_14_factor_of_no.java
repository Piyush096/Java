public class AA_14_factor_of_no {
    public static void main(String[] args){
        factor(13);
    }
    public static void factor(int number) {
        System.out.println("factor of " + number + " are: ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
