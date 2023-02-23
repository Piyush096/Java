
// insert node at any given position


import java.util.Scanner;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;

    }
}
public class A_03_insertNode {

    public static Node takeinput(){

        Node head = null;
        Node tail = null;

        Scanner in = new Scanner(System.in);

        while(true){

            int data = in.nextInt();

            if(data == -1)
               break;

            Node currnNode = new Node(data);

            if(head == null){
                head = currnNode;
                tail = currnNode;
            }
            else{
                tail.next = currnNode;
                tail = currnNode;
            }

        }
        return head;

    }
    public static Node insert_node_ith_position(Node head, int node, int position){

        Node node_inderted = new Node(node);

        if(position == 0){
            node_inderted.next = head;
            return node_inderted;
        }
        else{
            int count = 0;
            Node prevoious_node = head;
            while(count < position -1 && prevoious_node != null){
                count++;
                prevoious_node = prevoious_node.next;
            }
            if(prevoious_node != null){
                node_inderted.next = prevoious_node.next;
                prevoious_node.next = node_inderted;
            }
            return head;
        }

    }
    public static void printNode(Node head){

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args){
        Node head = takeinput();
        head = insert_node_ith_position(head, 3, 2);
        printNode(head);
    }

}
