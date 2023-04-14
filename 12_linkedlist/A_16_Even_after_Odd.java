import java.util.Scanner;

class Node{

    int data;
    Node next;

    Node(int data){

        this.data = data;
        this.next = null;
    }

}
public class A_16_Even_after_Odd {

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

    public static Node evenafterodd(Node head){

        if(head == null){

            return head;
        }

        Node even_head = null;
        Node even_tail = null;
        Node odd_head = null;
        Node odd_tail = null;

        while(head != null){
            if(head.data % 2 == 0){

                if(even_head == null){
                    even_head = head;
                    even_tail = head;
                }
                else{
                    even_tail.next = head;
                    even_tail = even_tail.next;
                }
            }
            else{
                if(odd_head == null){
                    odd_head = head;
                    odd_tail = head;
                }
                else{

                    odd_tail.next = head;
                    odd_tail = odd_tail.next;
                }
            }
            head = head.next;
        }
        if(odd_head == null){
            return even_head;
        }
        else{

            odd_tail.next = even_head;
        }
        if(even_head != null){

            even_tail.next = null;
        }

        return odd_head;
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

        Node head = takNode();
        head = evenafterodd(head);
        print_ll(head);
    }


}
