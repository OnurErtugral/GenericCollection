package Stack;

/**
 * Created by onur on 11.07.2017.
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        stack.push("onur");
        stack.push("ertugral");
        stack.push("Working");
        stack.push("Hard!");
        stack.print();
        try {
            while (true) {
                String poppedValue = stack.pop();
                System.out.printf("Popped Value: %s%n", poppedValue);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
