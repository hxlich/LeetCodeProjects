package com.company.LinkedList.ReorderList;

import com.company.LinkedList.LinkedList;
import com.company.Models.ListNode;

/**
 * Created by hanh on 12/16/2014.
 */
public class ReorderListTest {
    private static int [] sample1 = {1,2,3,4,5,6,7,8,9,10};
    private static int [] sample2 = {1,2,3,4,5};
    private static int [] sample3 = {1,2};
    private static void testRL(int [] sample){
        ListNode ln = LinkedList.createList(sample);
        System.out.print("original:");
        LinkedList.printList(ln);
        ReorderList rl = new ReorderList();
        rl.reorderList(ln);
        System.out.print("new:");
        LinkedList.printList(ln);
    }


    public static void test(){
        testRL(sample2);
        testRL(sample1);
        testRL(sample3);

    }
}
