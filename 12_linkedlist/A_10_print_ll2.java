class node{

    int  data;
    node next;


    node(int data){

        this.data = data;
        this.next = null;
    }
}

public class A_10_print_ll2 {

    node head;

    //add first
    // public void addfirst(int data){
    //     node newnode = new node(data);
    //     if(head == null){
    //         head = newnode;
    //         return;
    //     }

    //     newnode.next = head;
    //     head = newnode;
    // }


    public void addlast(int data){

        node newnode = new node(data);

        if(head == null){
            head = newnode;
            return;
        }

        node currnode = head;
        while(currnode.next != null){
            currnode = currnode.next;
        }

        currnode.next = newnode;
    }

    //print
    public void printlist(){

        if(head == null){
            System.out.println("list is empty");
            return;
        }

        node currnode = head;
        while(currnode != null){
            System.out.print(currnode.data + "-->");
            currnode = currnode.next;
        }
         System.out.println("NULL");

    }


    public static void main(String args[]){
        A_10_print_ll2 list = new A_10_print_ll2();

        list.addlast(7);
        list.addlast(3);
        list.printlist();
    }

}
