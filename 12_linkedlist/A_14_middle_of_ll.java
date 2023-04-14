import java.util.Scanner;

class Node{

    int data;
    Node next;

    Node(int data){

        this.data = data;
        this.next = null;
    }

}
public class A_14_middle_of_ll {

    public static Node takNode(){

        Node head = null;
        Node tail = null;

        Scanner in = new Scanner(System.in);

        while(true){

            int data = in.nextInt();

            if(data == -1){
                break;
            }

            Node currnode = new Node(data);

            if(head == null){
                head = currnode;
                tail = currnode;
            }
            else{

                tail.next = currnode;
                tail = currnode;
            }
        }
        return head;

    }


    public static void middlNode(Node head){

        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println("middle node of ll:-"+ slow.data);
    }

    public static void print_ll(Node head){

        Node tempNode = head;

        while(tempNode != null){

            System.out.print(tempNode.data + "--> ");
            tempNode = tempNode.next;

        }
        System.out.println("null" + "  ");
    }

    public static void main(String[] args){
        Node head = takNode();
        middlNode(head);
        print_ll(head);
    }

}
