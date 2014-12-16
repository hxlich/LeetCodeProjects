package com.company;

import com.company.LinkedList.LinkedList;
import com.company.Models.ListNode;

public class Main {

    public static void main(String[] args) {

//        IntersectionOfTwoLinkedListTest.test();
        int [] sample = {-9,-7,-3,-3,-1,2,3};
        int [] sample2 = {-7,-7,-6,-6,-5,-3,2,4};
        ListNode s1 = LinkedList.createList(sample);
        LinkedList.printList(s1);
        ListNode s2 = LinkedList.createList(sample2);
        LinkedList.printList(s2);
        ListNode n = LinkedList.mergeSortedListRec(s1,s2);
        LinkedList.printList(n);
    }



}
