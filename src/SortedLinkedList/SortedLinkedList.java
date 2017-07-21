package SortedLinkedList;


/**
 * Created by onur on 11.07.2017.
 */
class Node<T> {
    Node<T> nextNode;
    T data;

    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node<T> node) {
        this.data = data;
        nextNode = node;
    }
}
public class SortedLinkedList<T extends Comparable<T>> {
    private Node<T> firstNode;

    private Node<T> getLastNode() {
        Node<T> current = firstNode;
        while (current.nextNode != null) {
            current = current.nextNode;
        }
        return current;
    }

    public void insertFront(T insertValue) {
        if (isEmpty()) {
            firstNode = new Node<T>(insertValue);
        } else {
            firstNode = new Node<T>(insertValue, firstNode);
        }
    }

    public void sortedInsert(T insertValue) {
        if (isEmpty()) {
            firstNode = new Node<T>(insertValue);
        }else if (firstNode.data.compareTo(insertValue) > 0)
            firstNode = new Node<T>(insertValue, firstNode);
        else if (getLastNode().data.compareTo(insertValue) < 0)
            getLastNode().nextNode = new Node<T>(insertValue);
        else {
            Node<T> current = firstNode;
            while (current.nextNode != null && (current.nextNode.data.compareTo(insertValue) < 0)) {
                current = current.nextNode;
            }
            Node<T> temp = current.nextNode;
            current.nextNode = new Node<T>(insertValue, temp);
        }
    }

    public void reverseSortedInsert(T insertValue) {
        if (isEmpty()) {
            firstNode = new Node<T>(insertValue);
        }else if (firstNode.data.compareTo(insertValue) < 0)
            firstNode = new Node<T>(insertValue, firstNode);
        else if (getLastNode().data.compareTo(insertValue) > 0)
            getLastNode().nextNode = new Node<T>(insertValue);
        else {
            Node<T> current = firstNode;
            while (current.nextNode != null && (current.nextNode.data.compareTo(insertValue) > 0)) {
                current = current.nextNode;
            }
            Node<T> temp = current.nextNode;
            current.nextNode = new Node<T>(insertValue, temp);
        }
    }
    public void removeBack() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        } else {
            Node<T> current = firstNode;
            while (current.nextNode.nextNode != null) {
                current = current.nextNode;
            }
            current.nextNode = null;
        }
    }


    public void merge(SortedLinkedList list2) {
        Node<T> current = list2.firstNode;

        while (current != null) {
            sortedInsert(current.data);
            current = current.nextNode;
        }
    }



    public void print() {
        if (isEmpty()) {
            System.out.println("List is empty!");
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
