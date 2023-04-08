import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data){

        this.data = data;
        this.next = null;
    }
}
public class A_08_reverse_ll{

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

    public static void print_ll(Node head){

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public static void reverse_ll(Node head){

        if(head == null){
            return;
        }

        reverse_ll(head.next);
        System.out.print(head.data + " --> ");
    }

    public static void main(String[] args){
        Node head = takNode();
        print_ll(head);
        reverse_ll(head);
    }

}
