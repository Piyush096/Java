import java.util.*;

class Queue{
    private int[] data;
    private int front;
    private int rear;
    private int size;

    public Queue(){
        data = new int[3];
        front = -1;
        rear = -1;
        size = 0;
    }
    public Queue(int capacity){
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueue(int element){

        if(rear == data.length -1){
            throw new IllegalStateException("queue is full");
        }
        if(size == data.length){

            throw new IllegalStateException("queue is full.");
        }
        if(size == 0){
            front = 0;
        }
        rear++;
        data[rear] = element;
        size++;

    }

    public int front(){
        if(!isEmpty()){
            return data[front];
        }else {
            throw new IllegalStateException("queue is empty.");
        }

    }

    public int dequeue(){
        if(size == 0)
        {
            front = -1;
            rear = -1;
        }

        if(!isEmpty()){

            int element = data[front];
            front++;
            size--;
            return element;
        }
        else {
            throw new IllegalStateException("queue is empty");
        }

    }


}

class A_01_queue_using_Array{
    public static void main(String[] args) {

        Queue queue = new Queue();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n1. enqueue");
            System.out.println("2. dequeue");
            System.out.println("3. front");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1/2/3/4): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {

                System.out.print("Enter the item : ");
                int item = scanner.nextInt();

                queue.enqueue(item);
                System.out.println(" done");

            }

             else if (choice == 2) {
                try {
                    int item = queue.dequeue();
                    System.out.println(item + " done");
                }
                catch (IllegalStateException e) {
                    System.out.println(e.getMessage());
                }
            }

            else if (choice == 3) {
                try {
                    int item = queue.front();
                    System.out.println("The front item of the queue is: " + item);
                }
                catch (IllegalStateException e) {
                    System.out.println(e.getMessage());
                }
            }

            else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            }

            else {
                System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}
