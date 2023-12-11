import java.util.Scanner;
import java.util.LinkedList;
import java.lang.Math;

public class WeaponBoxes
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        LinkedList<Integer> new_linkedlist = new LinkedList<Integer>();

        while (input.hasNext())
        {
            new_linkedlist.add(input.nextInt());
        }

        int k = new_linkedlist.get(new_linkedlist.size() - 1);
        new_linkedlist.remove(new_linkedlist.size() - 1);

        int n = new_linkedlist.get(new_linkedlist.size() - 1);
        new_linkedlist.remove(new_linkedlist.size() - 1);

        int current_cycles = 0;
        int previously_new_unshifted = -1;

        long answer = 0;

        boolean res = true;

        while (res)
        {
            for (int i = 0; i < n - 1; ++i)
            {
                int shifted = -1;
                int new_unshifted = -1;

                if (new_linkedlist.get(0) >= new_linkedlist.get(1))
                {
                    shifted = new_linkedlist.get(1);
                    new_unshifted = new_linkedlist.get(0);
                    new_linkedlist.remove(1);
                    new_linkedlist.add(shifted);
                }

                else
                {
                    shifted = new_linkedlist.get(0);
                    new_unshifted = new_linkedlist.get(1);
                    new_linkedlist.remove(0);
                    new_linkedlist.add(shifted);
                }

                int x = (int) Math.sqrt((8 * shifted) + 1);

                if ((int) Math.pow(x, 2) != (8 * shifted) + 1)
                {
                    answer += shifted;
                }

                if (i == 0)
                {
                    if (new_unshifted == previously_new_unshifted)
                    {
                        ++current_cycles;
                    }
                }

                if (new_unshifted != previously_new_unshifted)
                {
                    current_cycles = 1;
                    previously_new_unshifted = new_unshifted;
                }

                if (current_cycles == k)
                {
                    res = false;
                }
            }
        }

        System.out.print(answer);

        input.close();
    }
}
