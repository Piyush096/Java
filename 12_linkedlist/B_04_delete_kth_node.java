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
public class B_04_delete_kth_node {
    public static void main(String[] args) {
        Node head = insertNode();
        printnode(head);
        head = delelkthnode(head, 1);
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
    public static Node delelkthnode(Node head, int k){
        Node temp = head;
        int count = 0;

        while (temp != null) {
            count ++;
            if(count == k){
                break;
            } else {
                temp = temp.next;
            }
        }
        Node front = temp.next;
        Node back = temp.prev;

        if(front == null && back == null) {
            return null;
        }
        if(front == null){

            back.next = null;
            temp.prev = null;
            return head;

        }
        if(back == null){
            head = front;
            front.prev = null;
            temp.next = null;
            return head;
        }
        else {
            back.next = front;
            front.prev = back;
            front = null;
            back = null;
            return head;
        }
    }
}
