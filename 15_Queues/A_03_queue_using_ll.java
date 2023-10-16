import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Queue{
    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public boolean isEmpty(){

        return head == null;
    }

    public int getsize(){
        return size;
    }

    public void enqueue(int data){
        size += 1;

        Node newnode = new Node(data);

        if(isEmpty()){

            head = newnode;
            tail = newnode;
        }
        else{
            tail.next = newnode;
            tail = newnode;
        }
    }

    public int front(){
        if(isEmpty()){
            return -1;
        }
        else{
            return head.data;
        }
    }

    public void dequeue(){

        if(isEmpty()){
            System.out.println("queue is Empty;");
        }
        else{

            int ans = head.data;
            head = head.next;
            size--;
            System.out.println(ans + " is dequeue succesfully");
        }
        if(size == 1){
            head = null;
            tail = null;
        }

    }
}

public class A_03_queue_using_ll {
    public static void main(String[] args){

        Queue queue = new Queue();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n1. enqueue");
            System.out.println("2. dequeue");
            System.out.println("3. front");
            System.out.println("4. size");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1/2/3/4/5): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {

                System.out.print("Enter the item : ");
                int item = scanner.nextInt();

                queue.enqueue(item);
                System.out.println(" done");

            }

             else if (choice == 2) {

                queue.dequeue();
            }

            else if (choice == 3) {

                int item = queue.front();

                if(item == -1){
                    System.out.println("queue is Empty");
                }
                System.out.println("The front item of the queue is: " + item);
            }

            else if(choice == 4){

                System.out.println(queue.getsize());
            }

            else if (choice == 5) {
                System.out.println("Exiting...");
                break;
            }

            else {
                System.out.println("Invalid choice. Please choose again.");
            }
        }

    }
}
