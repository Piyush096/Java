import java.util.Scanner;
import MyLinkedList.MyLinkedList;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        MyLinkedList l1 = new MyLinkedList();

        l1.add_begin(10);
        l1.add_begin(20);
        l1.add_begin(30);

        l1.print();

        System.out.println();

        MyLinkedList l2 = new MyLinkedList();

        while (true)
        {
            int data = sc.nextInt();

            if (data == -1)
                break;

            l2.add_begin(data);
        }

        l2.print();
    }
}
