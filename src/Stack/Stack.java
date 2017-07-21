package Stack;

/**
 * Created by onur on 11.07.2017.
 */
class Node<T> {
    T data;
    Node<T> nextNode;

    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node<T> nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }
}
public class Stack<T> {
    private Node<T> firstNode;

    public Node<T> getFirstNode() {
        return firstNode;
    }

    public void push(T pushValue) {
        if (isEmpty()) {
            firstNode = new Node<T>(pushValue);
        } else {
            firstNode = new Node<T>(pushValue, firstNode);
        }
    }

    public T pop() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        } else {
            Node<T> temp = firstNode.nextNode;
            T poppedValue = firstNode.data;
            firstNode = null;
            firstNode = temp;
            return poppedValue;
        }
    }


    public void print() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            Node<T> current = firstNode;

            while (current != null) {
                System.out.printf("%s ", current.data);
                current = current.nextNode;
            }
            System.out.println();
        }
    }

    private boolean isEmpty() {
        return firstNode == null;
    }

}
