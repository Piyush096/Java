import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data){

        this.data = data;
        this.next = null;
    }
}

public class A_13_reverse_ll {

    public static Node takNode(){

        Node head = null;
        Node tail = null;

        Scanner in = new Scanner(System.in);

        while(true){

            int data = in.nextInt();

            if(data == -1){
                break;
            }

            Node currNode = new Node(data);

            if(head == null){
                head = currNode;
                tail = currNode;
            }
            else{
                tail.next = currNode;
                tail = currNode;
            }
        }
        return head;
    }

    public static Node reverse_ll(Node head){
         if(head == null || head.next == null){
            return head;
         }
         Node smallhead = reverse_ll(head.next);
         Node tail = smallhead;
         while(tail.next != null){
            tail = tail.next;
         }
         tail.next = head;
         head.next = null;
         return smallhead;
    }
    // another simplest form to reverse the linked list;

    public static void print_ll(Node head){

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public static void main(String[] args){
        Node head = takNode();
        head = reverse_ll(head);
        print_ll(head);

    }

}
