
// delete node at given position;
import java.util.Scanner;

class Node{

    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class A_05_DeleteNode {


    public static Node takNode(){

        Node head = null;
        Node tail = null;

        Scanner in = new Scanner(System.in);

        while(true){

            int data = in.nextInt();

            if(data == -1)
            break;

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

    public static Node DeleteNode(Node head, int position){

        if(head == null){
            return head;
        }

        if(position == 0){
            return head.next;
        }

        int count = 0;
        Node currhead= head;

        while(currhead != null && count < position - 1){

            currhead = currhead.next;
            count ++;
        }

        if(currhead == null || currhead.next == null){

            return head;
        }

        currhead.next = currhead.next.next;
        return head;

    }

    public static void printNode(Node head){

        Node temp = head;

        while(temp != null){

            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {

        Node head = takNode();
        printNode(head);
        head = DeleteNode(head, 3);
        printNode(head);

    }

}
