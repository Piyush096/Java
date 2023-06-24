import java.util.Scanner;

class Node{

    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class A_17_insertion_in_circular_ll{

    public static Node take_Node(){

        Node head = null;
        Node tail = null;

        Scanner in = new Scanner(System.in);

         while(true)
         {
            int data = in.nextInt();


            if (data == -1)
                break;

            Node currNode = new Node(data);

            if(head == null){
                head = currNode;
                tail = currNode;
                currNode.next = head;
            }
            else{
                tail.next = currNode;
                tail = currNode;
                tail.next = head;
            }
         }


        return head;
    }

    public static void printNode(Node head){

        Node temp = head;

        if(head == null){
            System.out.println("list is empty");
        }

        while(temp != head){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }
    public static void main(String [] args){

        Node head = take_Node();
        printNode(head);


    }


}
