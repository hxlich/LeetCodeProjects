package com.company.LinkedList.SortList;

import com.company.LinkedList.LinkedList;
import com.company.Models.ListNode;

/**
 * Created by hanh on 12/17/2014.
 */
public class SortListTest {
    private static int [] sample1 = {10,9,8,7,6,5,4,3,2,1};
    private static int [] sample2 = {5,4,3,2,1};
    private static int [] sample3 = {1,2};
    private static void testSL(int [] sample){
        ListNode ln = LinkedList.createList(sample);
        System.out.print("original:");
        LinkedList.printList(ln);
        SortList sl =  new SortList();
        sl.sortList(ln);
        System.out.print("new:");
        LinkedList.printList(ln);
    }


    public static void test(){
        testSL(sample2);
        testSL(sample1);
        testSL(sample3);

    }
}
