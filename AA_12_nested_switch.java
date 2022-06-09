import java.util.Scanner;
public class AA_12_nested_switch{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        int empid = input.nextInt();
        String departement = input.next();

        // switch(empid){

        //     case 1:
        //     System.out.println("shyamaa");
        //     break;

        //     case 2:
        //     System.out.println("mohan");
        //     break;

        //     case 3:
        //     System.out.println("employ no 3 ");
        //     switch(departement){
        //         case "cse":
        //         System.out.println("computer science departement");
        //         break;

        //         case "it":
        //         System.out.println("information technology departement");
        //         break;

        //     }
        //     break;
        //     default:
        //     System.out.println("enter correct name and  departement");
        // }

//---------------------------------------------------------------------------------------------------------

        // this above nested switch problem can also written in the standard form:-

        switch (empid){
            case 1 -> System.out.println("shyamaa");
            case 2 -> System.out.println("mohan");
            case 3 -> {
                System.out.println("employ no 3");
            switch (departement){
                case "cse" -> System.out.println("computer science departement");
                case "it"  -> System.out.println("information technology departement");
                default -> System.out.println("no department entered");
            }
            }
        default -> System.out.println("enter correct information");
        }
    }
}
