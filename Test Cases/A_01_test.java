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

    public  Node take_Node(){

        Scanner in = new Scanner(System.in);

        Node head = null;
        Node tail = null;

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

    public static Node swap_nodes(Node head, int i, int j){

       if(i == j){
        return head;
       }

       Node previ = null;
       Node curri = head;

       while(curri != null && curri.data != i){
        previ = curri;
        curri = curri.next;
       }

       Node prevj = null;
       Node currj = head;

       while(currj != null && currj.data != j){
        prevj = currj;
        currj = curri.next;
       }

       if(curri == null || currj == null){

        return;
       }



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



    }
}









