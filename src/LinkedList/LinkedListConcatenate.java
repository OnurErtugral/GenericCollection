package LinkedList;

import LinkedList.LinkedList;
/**
 * Created by onur on 11.07.2017.
 */
public class LinkedListConcatenate {
    public static void concatenate(LinkedList first, LinkedList last) {
        first.getLastNode().nextNode = last.getFirstNode();
    }
}
