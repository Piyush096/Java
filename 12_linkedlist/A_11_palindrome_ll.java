import java.util.Scanner;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class A_11_palindrome_ll {

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

    }

    public static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static boolean isPalindrome(Node head) {
        if(head == null || head.next == null)
            return true;

        Node mid = middleList(head);
        Node secondHalf = reverse(mid.next);
        Node firstHalf = head;
        while(secondHalf != null){
            if(firstHalf.data != secondHalf.data){
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }
    public static Node middleList(Node head){
        Node fast = head;
        Node slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args){

        Node head = take_Node();
        printNode(head);
        System.out.println(isPalindrome(head));
    }
}


// using stack


// public boolean isPalindrome(ListNode head) {
//     if (head == null || head.next == null) {
//         return true; // Empty or single-node list is considered a palindrome
//     }

//     ListNode slow = head;
//     ListNode fast = head;

//     while (fast != null && fast.next != null) {
//         slow = slow.next;
//         fast = fast.next.next;
//     }

//     if (fast != null) { // If the list has odd number of nodes, move slow pointer one step ahead
//         slow = slow.next;
//     }

//     Stack<ListNode> stack = new Stack<>();

//     while (slow != null) {
//         stack.push(slow);
//         slow = slow.next;
//     }

//     while (!stack.isEmpty()) {
//         if (head.val != stack.pop().val) {
//             return false;
//         }
//         head = head.next;
//     }

//     return true;
// }
