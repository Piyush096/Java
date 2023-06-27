import java.util.Scanner;

class Node{

    int data;
    Node next;

    Node(int data){

        this.data = data;
        this.next = null;
    }
}

public class A_01_test{

    public static Node take_Node(){

        Scanner in = new Scanner(System.in);

        Node head = null;
        Node tail = null;

        while(true){

            int data = in.nextInt();

            if(data == -1)
             break;

            Node currentnNode = new Node(data);

            if(head == null){

                head = currentnNode;
                tail = currentnNode;
            }
            else{
                tail.next = currentnNode;
                tail = currentnNode;
            }
        }
        return head;

    }
    public static  Node merge_ll(Node head1, Node head2){

        if(head1 == null){
            return head2;
        }

        if(head2 == null){
            return head1;
        }

        Node new_head = null;
        Node tail = null;

        if(head1.data < head2.data){

            new_head = head1;
            tail = head1;
            head1 = head1.next;
        }
        else{
            new_head = head2;
            tail = head2;
            head2 = head2.next;

        }

        while(head1 != null && head2 != null){

            if(head1.data < head2.data){

                tail.next = head1;
                tail = head1;
                head1 = head1.next;
            }
            else{

                tail.next = head2;
                tail = head2;
                head2 = head2.next;
            }
        }

        if(head1 != null){

            tail.next = head1;
        }
        if(head2 != null){

            tail.next = head2;
        }

        return new_head;

    }
    public static void print_ll(Node head){

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public static void main(String[] args){

        Node head1= take_Node();
        Node head2 = take_Node();

        print_ll(head1);
        print_ll(head2);

       Node head = merge_ll(head1, head2);

       print_ll(head);
    }
}









