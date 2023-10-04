import java.util.Stack;

class test3
{
    public static void main(String[] args)
    {
        Stack<Integer> input = new Stack<Integer>();

        input.push(1);
        input.push(2);
        input.push(3);
        input.push(4);

        reverse(input);

        while (!(input.isEmpty()))
        {
            System.out.println(input.peek());
            input.pop();
        }
    }

    static void reverse(Stack<Integer> input)
    {
        if (input.isEmpty())
        {
            return;
        }

        else
        {
            int x = input.peek();
            input.pop();

            reverse(input);

            Stack<Integer> temp = new Stack<Integer>();

            while (!(input.isEmpty()))
            {
                temp.push(input.peek());
                input.pop();
            }

            input.push(x);

            while (!(temp.isEmpty()))
            {
                input.push(temp.peek());
                temp.pop();
            }
        }
    }
}


