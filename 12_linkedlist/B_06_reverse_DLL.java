import java.util.ArrayList;
import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        next = null;
        prev = null;
    }
}
class Stack {
    ArrayList<Integer> list = new ArrayList<>();

    public void push(int data) {
        list.add(data);
    }
    public boolean isempty(){
        return list.isEmpty();
    }
    public int pop() {
        if(isempty()){
            return -1;
        }
        int item = list.remove(list.size() - 1);
        return item;
    }
}
public class B_06_reverse_DLL {
    public static void main(String[] args) {
        Node head = insertNode();
        printDll(head);
        reverse_DLL(head);
        System.out.println("Linked List after reverse :-");
        printDll(head);

    }
    public static Node insertNode(){
        Node head = null;
        Node tail = null;

        Scanner sc = new Scanner(System.in);

        while (true) {
            int data = sc.nextInt();

            if(data == -1) {
                break;
            }
            Node newnNode = new Node(data);

            if (head == null) {
                head = newnNode;
                tail = newnNode;
            } else {
                tail.next = newnNode;
                newnNode.prev = tail;
                tail = newnNode;
            }
        }
        return head;
    }

    public static void reverse_DLL(Node head) {
        Node temp = head;

        Stack s1 = new Stack();
        while (temp != null) {
            s1.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            temp.data = s1.pop();
            temp = temp.next;
        }
    }

    public static void printDll(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("-> null");
    }


}
