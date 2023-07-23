public class test3 {
    public static void main(String args[]) {
        int x = 10;
        int y = 20;
        test3 sum = new test3();
        int z = add(x,y);
        System.out.println(z);
    }
    int add (int x, int y) {
        int sum = x + y;
        return sum;
    }

}
