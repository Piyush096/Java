import java.util.Scanner;
public class AA_11_fruit_switch{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        //String fruit = input.next();

        // switch(fruit){
        //     case "mango" -> System.out.println("king of fruits");
        //     case "apple" -> System.out.println("a sweet red fruit");
        //     case "orange" -> System.out.println("round fruit");
        //     default -> System.out.println("enter a valid fruit");
        // }

        int days = input.nextInt();

        // switch (days){
        //     case 1:
        //     case 2:
        //     case 3:
        //     case 4:
        //     case 5:
        //     System.out.println("weekday");
        //     break;

        //     case 6:
        //     case 7:
        //     System.out.println("weekend");
        //     break;
        // }

        // this same program can be written in the better form of / new version of switch case

        switch (days){
            case 1,2,3,4,5 ->  System.out.println("weekday");
            case 6,7 ->  System.out.println("weekend");
        }
    }
}
