import java.util.Scanner;

class Node{

    int data;
    Node next;

    Node(int data){

        this.data = data;
        this.next = null;
    }
}

public class A_06_delete_recursively {

    public static Node insNode(){

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

    public static Node deleteNode_recursively(Node head, int position){

        if(head == null){
            return head;
        }

        if(position == 0){

            return head.next;
        }

        Node smallhead = deleteNode_recursively(head.next, position - 1);
        head.next = smallhead;
        return head;
    }

    public static void print_ll(Node head){

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ "--");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){

        Node head = insNode();
        head = deleteNode_recursively(head, 1);
        print_ll(head);
    }


}
