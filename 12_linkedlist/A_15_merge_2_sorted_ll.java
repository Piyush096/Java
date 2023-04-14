import java.util.Scanner;

class Node{

    int data;
    Node next;

    Node(int data){

        this.data = data;
        this.next = null;
    }

}
public class A_15_merge_2_sorted_ll {

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

    public static Node merge_two_linkedlist(Node head1, Node head2){

        if(head1 == null){

            return head2;
        }

        if(head2 == null){

            return head1;
        }

        Node newhead = null;
        Node tail = null;

        if(head1.data < head2.data){

            newhead = head1;
            tail = head1;
            head1 = head1.next;
        }
        else{

            newhead = head2;
            tail = head2;
            head2 = head2.next;
        }

        while(head1 != null && head2 != null){

            if(head1.data < head2.data){

                tail.next = head1;
                tail = tail.next;
                head1 = head1.next;
            }
            else{

                tail.next = head2;
                tail = tail.next;
                head2 = head2.next;
            }
        }
        if(head1 != null){

            tail.next = head1;
        }
        if(head2 != null){

            tail.next = head2;
        }

        return newhead;
    }

    public static void print_ll(Node head){

        Node tempNode = head;

        while(tempNode != null){

            System.out.print(tempNode.data + "--> ");
            tempNode = tempNode.next;

        }
        System.out.println("null");
    }

    public static void main(String[] args){

        Node head1 = takNode();
        Node head2 = takNode();

        print_ll(head1);
        print_ll(head2);

        Node head = merge_two_linkedlist(head1, head2);

        print_ll(head);



    }


}
