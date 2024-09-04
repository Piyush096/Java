import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        next = null;
        prev = null;
    }
}
public class B_07_reverse_DLL2 {
    public static void main(String[] args) {
        Node head = insertNode();
        printDll(head);
        head = reverse_DLL(head);
        System.out.println("Linked List after reverse :-");
        printDll(head);
    }
    public static Node insertNode(){
         Node head = null;
        Node tail = null;

        Scanner sc = new Scanner(System.in);

        while (true) {
            int data = sc.nextInt();

            if(data == -1) {
                break;
            }
            Node newnNode = new Node(data);

            if (head == null) {
                head = newnNode;
                tail = newnNode;
            } else {
                tail.next = newnNode;
                newnNode.prev = tail;
                tail = newnNode;
            }
        }
        return head;
    }

    public static Node reverse_DLL(Node head){
        Node tail = null;
        Node current = head;

        while (current != null) {
            tail = current.prev;
            current.prev = current.next;
            current.next = tail;

            current = current.prev;
        }
        head = tail.prev;
        return head;

    }
    public static void printDll(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("-> null");
    }
}
