import java.util.*;

class Node {
    int data;
    Node next;
    Node previous;

    Node (int data) {
        this.data = data;
        next = null;
        previous = null;
    }
}


class Demo {
    public static void main(String[] args){
        Stack s = new Stack();

    }

    public static Node insertnode() {
        Node head = null;
        Node tail = null;

        Scanner sc = new Scanner(System.in);

        while (true) {

            int data = sc.nextInt();

            if (data == -1) {
                break;
            }

            Node newnode = new Node(data);

            if (head == null) {
                head = newnode;
                tail = newnode;
            }
            else {
                tail.next = newnode;
                newnode.previous = tail;
                tail = newnode;
            }
        }
        return head;
    }
}
