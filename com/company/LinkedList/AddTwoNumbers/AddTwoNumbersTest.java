package com.company.LinkedList.AddTwoNumbers;

import com.company.LinkedList.LinkedList;
import com.company.Models.ListNode;

/**
 * Created by hanh on 12/16/2014.
 */
//        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//        Output: 7 -> 0 -> 8
public class AddTwoNumbersTest {
    private static int  [] sample1 = {2,4,5,4,5};
    private static int [] sample2 = {5,6,4,5};
    private static void testATN(int [] numbA, int [] numbB ){
        ListNode s1 = LinkedList.createList(numbA);
        ListNode s2 = LinkedList.createList(numbB);
        LinkedList.printList(s1);
        LinkedList.printList(s2);

        AddTwoNumbers atn = new AddTwoNumbers();
        ListNode r = atn.addTwoNumbers(s1, s2);
        LinkedList.printList(r);

    }


    public static void test(){
        testATN(sample1, sample2);
    }
}
