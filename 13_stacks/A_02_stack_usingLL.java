import java.util.Scanner;

class EmptyStackException extends Exception {
    public String toString() {
        return "Error: Pop is applied to an empty stack!";
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public int pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        int top = head.data;
        head = head.next;
        return top;
    }

    public int peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return head.data;
    }
}

public class A_02_stack_usingLL {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter stack elements (enter -1 to stop):");

        while (true) {
            int data = in.nextInt();

            if (data == -1) {
                break;
            }

            s1.push(data);
        }

        while (!s1.isEmpty()) {
            try {
                System.out.println(s1.peek());
                s1.pop();
            } catch (EmptyStackException e) {
                System.out.println(e);
            }
        }
    }
}
