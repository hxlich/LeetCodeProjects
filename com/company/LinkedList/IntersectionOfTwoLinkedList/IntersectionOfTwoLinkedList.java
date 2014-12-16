package com.company.LinkedList.IntersectionOfTwoLinkedList;

import com.company.Models.ListNode;

//For example, the following two linked lists:
//
//        A:          a1 → a2
//                             ↘
//                              c1 → c2 → c3
//                             ↗
//        B:     b1 → b2 → b3
//        begin to intersect at node c1.
//Notes:
//
//        If the two linked lists have no intersection at all, return null.
//        The linked lists must retain their original structure after the function returns.
//        You may assume there are no cycles anywhere in the entire linked structure.
//        Your code should preferably run in O(n) time and use only O(1) memory.

public class IntersectionOfTwoLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        boolean aFlag = false, bFlag = false;
        ListNode a = headA, b = headB;
        for(;;){
            if(a.val == b.val){
                return a;
            }

            if(a.next == null){
                if(aFlag){
                    return null;
                }
                aFlag = true;
                a = headB;
            }else {
                a = a.next;
            }

            if(b.next == null){
                if(bFlag){
                    return null;
                }
                bFlag = true;
                b = headA;
            }else {
                b = b.next;
            }

        }
    }
}
