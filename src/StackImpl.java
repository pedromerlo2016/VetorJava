import java.util.Random;
import java.util.Stack;

public class StackImpl {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Random random = new Random();
        int i = 5;
        while (i != 0) {
            System.out.println("PUSH " + stack.push(random.nextInt(20)));
            i--;
        }
        System.out.println("-------------------------------------------");
        for (int j = 0; j < 5; j++) {
            System.out.println("POP " + stack.pop());
        }
        System.out.println("-------------------------------------------");
        stack.add(20);
        if (stack.size() != 0) {
            System.out.println("ADD e POP " + stack.get(0));
            System.out.println("SIZE " + stack.size());
        }
        

    }
}
