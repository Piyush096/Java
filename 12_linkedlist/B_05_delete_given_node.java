import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        next = null;
        prev = null;
    }
}
public class B_05_delete_given_node {
    public static void main(String[] args) {
        Node head = insertNode();
        printnode(head);
        deletenode(head.next);
        printnode(head);
    }

    public static Node insertNode(){
        Node head = null;
        Node tail = null;

        Scanner sc = new Scanner(System.in);

        while (true) {
            int data = sc.nextInt();

            if (data == -1){
                break;
            }

            Node newnode = new Node(data);

            if(head == null){
                head = newnode;
                tail = newnode;
            } else {
                tail.next = newnode;
                newnode.prev = tail;
                tail = newnode;
            }
        }
        return head;
    }
    public static void printnode(Node head){
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("-> null");
    }
    public static void deletenode(Node temp){

        Node front = temp.next;
        Node back = temp.prev;


        if(front == null){

            back.next = null;
            temp.prev = null;
            return ;
        }
        else {
            back.next = front;
            front.prev = back;
            front = null;
            back = null;
            return;
        }
    }

}
