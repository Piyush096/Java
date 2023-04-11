import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class A_07_Append_last_N_tofirst {
    public static Node takeNode(){

        Node head = null;
        Node tail = null;

        Scanner in = new Scanner(System.in);

        while(true){

            int data = in.nextInt();

            if(data == -1)
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
    public static Node append_lastNto_first(Node head, int n){
        if(n== 0 || head == null){
            return head;
        }
        Node fast = head;
        Node slow = head;
        Node initial_head = head;

        for(int i = 0; i < n; i++){
            fast = fast.next;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        Node temp = slow.next;
        slow.next = null;
        fast.next = initial_head;
        head = temp;

        return temp;
    }
    public static Node printNode(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args){
        Node head = takeNode();
        head = append_lastNto_first(head, 3);
        printNode(head);

    }


}

