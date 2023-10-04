import java.util.Scanner;

class Stack {
    private int capacity = 1000;
    private int[] stack = new int[capacity];
    private int top = -1;

    public void push(int item) {
        if (top < capacity - 1) {
            top++;
            stack[top] = item;
        } else {
            System.out.println("Stack overflow. Cannot push item: " + item);
        }
    }
    public boolean isEmpty() {
        return top == -1;
    }

    public int pop() {
        if (!isEmpty()) {
            int item = stack[top];
            top--;
            return item;
        } else {
            throw new IllegalStateException("Stack is empty. Cannot pop from an empty stack.");
        }
    }


    public int peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            throw new IllegalStateException("Stack is empty.");
        }
    }
}

public class A_03_stack_using_Array {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Push item to stack");
            System.out.println("2. Pop item from stack");
            System.out.println("3. Peek top item of stack");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1/2/3/4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character after reading the integer input

            if (choice == 1) {
                System.out.print("Enter the item to push: ");
                int item = scanner.nextInt();
                stack.push(item);
                System.out.println(item + " pushed to the stack.");
            } else if (choice == 2) {
                try {
                    int item = stack.pop();
                    System.out.println(item + " popped from the stack.");
                } catch (IllegalStateException e) {
                    System.out.println(e.getMessage());
                }
            } else if (choice == 3) {
                try {
                    int item = stack.peek();
                    System.out.println("The top item of the stack is: " + item);
                } catch (IllegalStateException e) {
                    System.out.println(e.getMessage());
                }
            } else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Please choose again.");
            }
        }
        scanner.close();
    }
}
