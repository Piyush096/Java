class EmptyStackException extends Exception
{
    public String toString()
    {
        return "Error: Pop is applied to an empty stack!";
    }
}
class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }
class stack{
    Node head;

    public boolean isempty(){
        return head == null;
    }

    public void push(int data){

        Node newnode = new Node(data);

        if(isempty()){
            head = newnode;
        }
        else{
            newnode.next = head;
            head = newnode;
        }
    }

    public int pop() throws EmptyStackException {

        if(isempty()){
            throw new EmptyStackException();
        }
        int top = head.data;
        head = head.next;
        return top;
        } 

    public int peek() throws EmptyStackException{
        if(isempty()){
            throw new EmptyStackException();
        }
        return head.data;
    }

}


public class A_01_stack_usingLL {
    public static void main(String[] args)
    {
        stack s1 = new stack();
        stack s2 = new stack();

        s1.push(1);
        s2.push(2);

        try {
            System.out.println(s1.peek());
            s1.pop();
        } catch (EmptyStackException e) {
            System.out.println(e);
        }

        try {
            System.out.println(s2.peek());
            s2.pop();
        } catch (EmptyStackException e) {
            System.out.println(e);
        }
    }

}
