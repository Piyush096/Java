import java.util.Scanner;

class Node{

    int data;
    Node next;

    Node(int data){

        this.data = data;
        this.next = null;
    }
}
public class A_04_insertNode_recursive {

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

    public static Node insert_recursively(Node head, int element , int position) {

        if(head == null && position > 0){

            return head;
        }

        if(position == 0){

            Node newNode = new Node(element);
            newNode.next = head;
            return newNode;
        }
        else{
            head.next = insert_recursively(head.next, element, position - 1);
            return head;
        }

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
        head = insert_recursively(head, 10, 2);
        print_ll(head);
    }
}
