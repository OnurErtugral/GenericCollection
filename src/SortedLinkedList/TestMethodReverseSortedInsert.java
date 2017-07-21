package SortedLinkedList;

import java.util.Random;

/**
 * Created by onur on 11.07.2017.
 */
public class TestMethodReverseSortedInsert {
    public static void main(String[] args) {
        SortedLinkedList<Integer> list = new SortedLinkedList<Integer>();
        Random ranNum = new Random();

        for (int i = 0; i < 10; i++) {
            list.reverseSortedInsert(ranNum.nextInt(90) + 10);
        }
        list.print();


    }
}
