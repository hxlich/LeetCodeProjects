package com.company.RemoveDuliList;

import com.company.Models.ListNode;

/**
 * Created by hanh on 12/11/2014.
 */
public class RemoveDuliListTest {
    private static int [] sample1 = {1,2,3,4,5,6};
    private static int [] sample2 = {1,1,2,4,5,6};
    private static int [] sample3 = {1,2,3,3,3,6};
    private static int [] sample4 = {1,1,1,1,1,1};
    private static int [] sample5 = {1};

    private static ListNode createList(int [] inputs){

        ListNode head = new ListNode(inputs[0]);
        ListNode current = head;

        for(int i = 1 ; i< inputs.length ; i++){
            ListNode ln = new ListNode(inputs[i]);
            current.next = ln;
            current = ln;
        }
        return head;
    }

    private static void printList(ListNode ln){
        System.out.print("[");
        while(ln != null){
            System.out.print(Integer.toString(ln.val));
            if(ln.next != null){
                System.out.print(",");
            }
            ln = ln.next;
        }
        System.out.print("]\n");
    }

    private static void testRDL(int [] sample){
        ListNode ln = createList(sample);
        System.out.print("original:");
        printList(ln);
        ln = RemoveDupliList.deletDuplicaties(ln);
        System.out.print("new:");
        printList(ln);
    }

    public static void test(){
        testRDL(sample1);
        testRDL(sample2);
        testRDL(sample3);
        testRDL(sample4);
        testRDL(sample5);
    }
}
