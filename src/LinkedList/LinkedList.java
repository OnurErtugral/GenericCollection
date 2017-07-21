package LinkedList;

/**
 * Created by onur on 11.07.2017.
 */
class Node<T> {
    Node<T> nextNode;
    T data;
    String name;

    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node<T> node) {
        this.data = data;
        this.nextNode = node;
    }
}
public class LinkedList<T> {
    private Node<T> firstNode;
    private String name;

    public LinkedList() {
        name = "Linked List";
    }

    public LinkedList(String name) {
        this.name = name;
    }

    public void insertFront(T object) {
        if (isEmpty())
            firstNode  = new Node<T>(object);
        else
            firstNode = new Node<T>(object, firstNode);
    }

    public Node<T> getFirstNode() {
        return firstNode;
    }

    public Node<T> getLastNode() {
        Node<T> currrent = firstNode;
        while (currrent.nextNode != null) {
            currrent = currrent.nextNode;
        }
        return currrent;
    }

    public void insertBack(T object) {
        if (isEmpty()) {
            firstNode = new Node<T>(object);
        } else {
            Node<T> current = firstNode;

            while (current.nextNode != null) {
                current = current.nextNode;
            }

            current.nextNode = new Node<T>(object);
        }
    }

    public void removeFront() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        } else {
            firstNode = firstNode.nextNode;

        }
    }

    public void removeBack() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        } else {
            Node<T> current = firstNode;

            while (current.nextNode.nextNode != null)
                current = current.nextNode;
            current.nextNode = null;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.printf("%s is Empty!\n", name);
        } else {
            System.out.printf("%s is: ", name);
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
