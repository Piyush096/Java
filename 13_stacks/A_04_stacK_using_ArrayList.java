
import java.util.ArrayList;
import java.util.Scanner;

class Stack {
    private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public void push(String item) {
        stack.add(item);
    }

    public String pop() {
        if (!isEmpty()) {
            return stack.remove(stack.size() - 1);
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public String peek() {
        if (!isEmpty()) {
            return stack.get(stack.size() - 1);
        } else {
            return null;
        }
    }
}

public class A_04_stacK_using_ArrayList{
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
                String item = scanner.nextLine();
                stack.push(item);
                System.out.println(item + " pushed to the stack.");
            } else if (choice == 2) {
                String item = stack.pop();
                if (item != null) {
                    System.out.println(item + " popped from the stack.");
                } else {
                    System.out.println("Stack is empty. Cannot pop from an empty stack.");
                }
            } else if (choice == 3) {
                String item = stack.peek();
                if (item != null) {
                    System.out.println("The top item of the stack is: " + item);
                } else {
                    System.out.println("Stack is empty.");
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

