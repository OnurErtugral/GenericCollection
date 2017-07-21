package SortedLinkedList;

import java.util.Random;

/**
 * Created by onur on 11.07.2017.
 */
public class SortedLinkedListTest {
    public static void main(String[] args) {
        SortedLinkedList<Integer> list1 = new SortedLinkedList<Integer>();
        SortedLinkedList<Integer> list2 = new SortedLinkedList<Integer>();
        Random ranNum = new Random();
        Random ranNum2 = new Random();

        for (int i = 0; i < 10; i++) {
            list1.sortedInsert(ranNum.nextInt(90) + 10);
            list2.sortedInsert(ranNum2.nextInt(90) + 10);
        }

            list1.print();
            list2.print();
            System.out.println();
            list1.merge(list2);
            list1.print();
    }
}
