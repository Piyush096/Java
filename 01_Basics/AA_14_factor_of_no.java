import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        next = null;
    }
}
public class AA_14_factor_of_no {
    public static void main(String[] args){

        Node head = insertNode();
        printll(head);
        System.out.println(middNode(head));
    }
    public static Node insertNode(){
        Node head = null;
        Node tail = null;

        Scanner sc = new Scanner(System.in);

        while (true) {
            int data = sc.nextInt();

            if(data == -1){
                break;
            }

            Node newnode = new Node(data);

            if(head == null){
                head = newnode;
                tail = newnode;
            }
            else{
                tail.next = newnode;
                tail = newnode;
            }
        }
        return head;
    }
    public static int middNode(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    public static Node reversell(Node head){
        Node previous = null;
        Node current = head;
        Node tail = null;

        while (current != null) {
            tail = current.next;
            current.next = previous;
            previous = current;
            current = tail;
        }
        return previous;
    }
    public static void printll(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }
}
