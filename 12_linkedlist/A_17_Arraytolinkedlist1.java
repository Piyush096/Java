
import java.util.Arrays;

class Node {
    int data;
    Node next;

    Node (int data) {
        this.data = data;
        next = null;
    }
}
public class A_17_Arraytolinkedlist1 {

    public static Node insertNode(int[] arr) {
        Node head = null;
        Node tail = null;

        int i = 0;
        while (i < arr.length) {

            Node newnNode = new Node(arr[i]);

            if(head == null) {
                head = newnNode;
                tail = newnNode;
            } else {
                tail.next = newnNode;
                tail = newnNode;
            }
            i++;
        }
        return head;
    }

    public static void pritnll(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println("-> null");
    }
    public static void main(String[] args) {
        int [] arr = {5, 8, 2, 9};
        System.out.println("Given array is :-" + Arrays.toString(arr));
        Node head = insertNode(arr);
        System.out.print("New linked list is :- " );
        pritnll(head);
    }
}

