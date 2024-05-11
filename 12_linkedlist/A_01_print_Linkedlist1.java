// to take input and print the linked list;

import java.util.Scanner;

class Node{

    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class A_01_print_Linkedlist1{

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

    public static void printNode(Node head){

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
       // return head;
    }
    public static void main(String [] args){

        Node head = take_Node();
        printNode(head);


    }


}
