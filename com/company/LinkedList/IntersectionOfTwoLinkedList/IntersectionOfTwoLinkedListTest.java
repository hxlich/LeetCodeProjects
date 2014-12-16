package com.company.LinkedList.IntersectionOfTwoLinkedList;

import com.company.LinkedList.LinkedList;
import com.company.Models.ListNode;

/**
 * Created by hanh on 12/15/2014.
 */
public class IntersectionOfTwoLinkedListTest {

    private static int [] sample1 = {3,4,5,6,7,8,9,10,11,12,13,14,15};
    private static int [] sample2 = {2,3,4,5,6,7,8,9,10,11,12,13,14,15};

    private static void testIOTLL(int [] sample1, int [] sample2){
        ListNode s1 = LinkedList.createList(sample1);
        ListNode s2 = LinkedList.createList(sample2);
        System.out.print("original:");
        LinkedList.printList(s1);
        System.out.print(" ");
        LinkedList.printList(s2);
        IntersectionOfTwoLinkedList i = new IntersectionOfTwoLinkedList();
        ListNode c = i.getIntersectionNode(s1, s2);
        System.out.print("common:");
//        if(c == null){
//            System.out.print("null");
//        }else {
//            System.out.print(Integer.toString(c.val));
//        }
        LinkedList.printList(c);
    }

    public static void test(){
        testIOTLL(sample1,sample2);
//        testIOTLL(sample2);
//        testIOTLL(sample3);
//        testIOTLL(sample4);
//        testIOTLL(sample5);
    }
}
