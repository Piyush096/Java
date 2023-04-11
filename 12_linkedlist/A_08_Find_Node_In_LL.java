import java.util.Scanner;

class Node{

    int data;
    Node next;

    Node(int data){

        this.data = data;
        this.next = null;
    }
}

public class A_08_Find_Node_In_LL {

    public static Node take_Node(){

        Node head = null;
        Node tail = null;

        Scanner in = new Scanner(System.in);

         while(true)
         {
            int data = in.nextInt();


            if (data == -1)
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
    public static Node printNode(Node head){

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println(" ");
        return head;
    }
    public static int find_node(Node head, int n){

        if(head == null){
            return -1;
        }

        int i = 0;
        while(head != null){
            if(head.data == n){
                return i;
            }
            head = head.next;
            i++;
        }
        return -1;

    }
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        Node head = take_Node();
        printNode(head);
        System.out.print("enter the node to find =  ");
        int a = in.nextInt();
        System.out.println("position of Node " + a + " is =  "+ find_node(head, a));
    }
}
