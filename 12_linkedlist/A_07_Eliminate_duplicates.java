import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;

    }
}
public class A_07_Eliminate_duplicates {

    public static Node take_Node(){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the node of linked_list = ");

        Node head = null;
        Node tail = null;

        while(true){

            int data = in.nextInt();

            if(data == -1)
            break;

            Node curNode = new Node(data);

            if(head == null){
                head = curNode;
                tail = curNode;

            }
            else{
                tail.next = curNode;
                tail = curNode;
            }
        }
        return head;

    }
    public static Node eliminatenode(Node head){
        if (head == null){
            return head;
        }
        Node currhead = head;

        while(currhead.next != null){
            if(currhead.data == currhead.next.data){
                currhead.next = currhead.next.next;
            }
            else{
                currhead = currhead.next;
            }
        }
        return head;
    }

    public static void print_ll(Node head){

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+ " --> ");
            temp = temp.next;
        }
        System.out.println("NULL");
        //return head;
    }
    public static void main(String [] args){

        Node head = take_Node();
        head = eliminatenode(head);
        print_ll(head);


    }

}
