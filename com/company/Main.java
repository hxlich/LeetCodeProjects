package com.company;

import com.company.LinkedList.LinkedList;
import com.company.Models.ListNode;

public class Main {

    public static void main(String[] args) {

//        IntersectionOfTwoLinkedListTest.test();
        int [] sample = {1,2,3,4,5};
        ListNode s1 = LinkedList.createList(sample);
        LinkedList.printList(s1);
        ListNode n = LinkedList.reverseBetween(s1, 1,5);
        LinkedList.printList(n);
//        ListNode s2 = LinkedList.createList(sample2);
//        LinkedList.printList(s2);
//
//        LinkedList.printList(n);
    }



}
