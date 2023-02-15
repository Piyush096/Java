import java.util.Scanner;
class Node{

    int data;
    Node next;

}



public class Test {
    public static void main(String[] args){

        Node head = null;
        Node tail = null;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the data");

        for(int i = 0; i < 5; i++){
            Node currentnode = new Node();

            currentnode.data= in.nextInt();
            currentnode.next = null;

            if(head == null){
                head = currentnode;
                tail = currentnode;

            }
            else{
                tail.next = currentnode;
                tail = currentnode;
            }
        }

        Node temp = head;

        while(temp != null){
            System.out.println(temp.data+ " ");
            temp = temp.next;
            // System.out.println(" ");
        }

    }

}
