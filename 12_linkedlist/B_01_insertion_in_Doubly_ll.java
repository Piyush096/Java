import java.util.*;

class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        next = null;
        prev = null;
    }
}

public class B_01_insertion_in_Doubly_ll {

    public static Node take_Node(){

        Node head = null;
        Node tail = null;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the data of Nodes = ");
        while(true){

            int data = in.nextInt();
            if(data == -1){
                break;
            }

            Node new_Node = new Node(data);

            if(head == null){
                head = new_Node;
                tail = new_Node;
            }
            else{
                tail.next = new_Node;
                new_Node.prev = tail;
                tail = new_Node;
            }
        }
        return head;
    }

    public static void print_ll(Node head){

        Node current = head;

        System.out.print("NULL");
        while(current != null){
            System.out.print(current.data + " <--> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Node head = take_Node();
        print_ll(head);
    }
}
