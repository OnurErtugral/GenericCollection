package LinkedList;

import LinkedList.LinkedList;

/**
 * Created by onur on 11.07.2017.
 */
public class LinkedLisTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.insertBack("I");
        list.insertBack("DID IT!");
        list.print();

        LinkedList<String> list2 = new LinkedList<String>();
        list2.insertBack("IT'S GETTING BETTER!");
        list2.print();
        LinkedListConcatenate.concatenate(list, list2);
        System.out.println("Concatenated List:");
        list.print();

        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
