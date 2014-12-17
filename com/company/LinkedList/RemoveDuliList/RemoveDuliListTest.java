package com.company.LinkedList.RemoveDuliList;

import com.company.LinkedList.LinkedList;
import com.company.Models.ListNode;
/**
 * Created by hanh on 12/11/2014.
 */
public class RemoveDuliListTest {
    private static int [] sample1 = {1,1,2,2};
    private static int [] sample2 = {1,1,2,4,5,6};
    private static int [] sample3 = {1,2,3,3,3,6};
    private static int [] sample4 = {1,2,2,2,2,3};
    private static int [] sample5 = {1,1,1,1,1,1};

    private static void testRDL(int [] sample){
        ListNode ln = LinkedList.createList(sample);
        System.out.print("original:");
        LinkedList.printList(ln);
        RemoveDupliList ld = new RemoveDupliList();
        ln = ld.deleteDuplicates2(ln);
        System.out.print("new:");
        LinkedList.printList(ln);
    }

    public static void test(){
        testRDL(sample1);
        testRDL(sample2);
        testRDL(sample3);
        testRDL(sample4);
        testRDL(sample5);
    }
}
