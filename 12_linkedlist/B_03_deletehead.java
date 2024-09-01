import java.util.Arrays;
import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node prev;

    Node (int data) {
        this.data = data;
        next = null;
        prev = null;
    }
}
public class B_03_deletehead{
    public static void main(String[] args) {
        Node head = insertNode();
        pritnll(head);
        head = deleltehead(head);
        pritnll(head);
    }

    public static Node insertNode() {
        Node head = null;
        Node tail = null;

        Scanner sc = new Scanner(System.in);

        while(true) {
            int data = sc.nextInt();

            if(data == -1) {
                break;
            }

            Node newnNode = new Node(data);

            if(head == null) {
                head = newnNode;
                tail = newnNode;
            }else {
                tail.next = newnNode;
                newnNode.prev = tail;
                tail = newnNode;
            }
        }
        return head;
    }
    public static Node deleltehead(Node head){
        Node temp = head;
        head = head.next;
        temp.next = null;
        head.prev = null;

        return head;
    }

    public static void pritnll(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println("-> null");
    }
}
