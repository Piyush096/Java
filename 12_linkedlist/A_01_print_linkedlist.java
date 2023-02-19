import java.util.Scanner;

class Node<T>{

    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        this.next = null;
    }
}

class A_01_print_linkedlist{

    // public static Node<Integer> createlinkedlist(){

    //     Node<Integer> n1 = new Node<>(10);
    //     Node<Integer> n2 = new Node<>(20);
    //     Node<Integer> n3 = new Node<>(30);
    //     Node<Integer> n4 = new Node<>(40);

    //     n1.next = n2;
    //     n2.next = n3;
    //     n3.next = n4;

    //     return n1;

    // }

//    taking input to construct linked list ;
    public static Node<Integer> takeinput(){

         Scanner in = new Scanner(System.in);

         int data = in.nextInt();
         Node<Integer> head = null , tail = null;

         while(data != -1){
            Node<Integer> currNode = new Node<Integer>(data);
            // tail.next=currNode;
            currNode.next=null;
            if(head == null){
                head = currNode;
                tail = currNode;
            }
            else{
                tail.next = currNode;
                tail = currNode;
            }
            data = in.nextInt();
         }
         return head;


    }
    public static void print(Node<Integer> head){
        //System.out.println("print" + head);

        Node<Integer> temp = head;
        //assigning head to temp

        while(temp != null){
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println("  ");
    }


    // count the length of the linked list
    public static int length(Node<Integer> head){
        int count = 0;
        Node<Integer> temp = head;
          while(temp != null){
            count ++;
            temp = temp.next;

          }
          return count;
    }

    // print the ith node of a given linked list  :-

    public static void printithnode(Node<Integer> head, int i ){
        int position = 0;

        Node<Integer> temp = head;
        while(temp != null && position < i){
            temp = temp.next;
            position++;
        }
        if(temp != null){
            System.out.println(temp.data);
        }
    }
    public static void  main(String[] args){

    // Node<Integer> head = createlinkedlist();\
    Node<Integer> head = takeinput();
    print(head);
    // System.out.println("length of the linked list is :- " +length(head));
    // printithnode(head, 2);



    }
}
