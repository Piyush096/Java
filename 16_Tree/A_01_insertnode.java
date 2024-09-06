import java.util.ArrayList;
import java.util.Scanner;

class TreeNode<T> {
    int data;
    ArrayList<TreeNode<T>> children;

    public TreeNode(int data) {
        this.data = data;
        children = new ArrayList<>();
    }
}

public class A_01_insertnode {
    public static void main(String[] args) {

    }
    public static TreeNode<Integer> userInput(){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the next node data");
        int data = s.nextInt();

        TreeNode<Integer> root = new TreeNode(data);
        System.out.println("Enter the number of childeren");
        int childcount = s.nextInt();

        for(int i = 0; i <= childcount; i++) {
            TreeNode<Integer> child =  userInput();
            root.children.add(child);
        }
        return root;
    }
}
