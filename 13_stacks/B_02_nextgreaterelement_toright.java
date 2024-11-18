import java.util.ArrayList;
import java.util.Stack;
import java.util.Collections;

public class B_02_nextgreaterelement_toright {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for(int i = arr.length - 1; i >= 0; i--){
            if (stack.isEmpty()) {
                list.add(-1);
            }
            else if(!stack.isEmpty() && stack.peek() > arr[i]){
                list.add(stack.peek());
            }
            else if(!stack.isEmpty() && stack.peek() <= arr[i]){
                while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                    stack.pop();
                }
                if(stack.isEmpty()){
                    stack.peek();
                }
                else{
                    list.add(stack.peek());
                }
            }
            stack.push(arr[i]);
        }
        Collections.reverse(list);
        System.out.println(list);

    }
}
