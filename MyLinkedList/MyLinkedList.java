package MyLinkedList;

public class MyLinkedList
{
    static class Node
    {
        int data;
        Node ref_next_node;

        Node(int data)
        {
            this.data = data;
            ref_next_node = null;
        }
    }

    private Node ref_head_node;

    public MyLinkedList()
    {
        ref_head_node = null;
    }

    public void add_begin(int data)
    {
        Node ref_new_node = new Node(data);

        if (ref_head_node == null)
        {
            ref_head_node = ref_new_node;
        }

        else
        {
            ref_new_node.ref_next_node = ref_head_node;
            ref_head_node = ref_new_node;
        }
    }

    public void print()
    {
        Node ref_current_node = ref_head_node;

        while (ref_current_node != null)
        {
            System.out.print(ref_current_node.data + " ");
            ref_current_node = ref_current_node.ref_next_node;
        }

        System.out.println();
    }
}
