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

        Node tail = null;
        Node head = null;

        while(true){

            int data = in.nextInt();

            if(data == -1){
                break;
            }

            Node currentNode = new Node(data);

            if(head == null){
                head = currentNode;
                tail = currentNode;
            }
            else{

                tail.next = currentNode;
                tail = currentNode;
            }

        }
        return head;


    }







