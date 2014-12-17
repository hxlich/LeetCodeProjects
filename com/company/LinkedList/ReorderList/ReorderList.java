package com.company.LinkedList.ReorderList;

import com.company.Models.ListNode;

/**
 * Created by hanh on 12/16/2014.
 */
//Given a singly linked list L: L0→L1→…→L(n-1)→Ln,
//        reorder it to: L0→Ln→L1→L(n-1)→L2→L(n-2)→…
//
//        You must do this in-place without altering the nodes' values.
//
//        For example,
//        Given {1,2,3,4}, reorder it to {1,4,2,3}.
public class ReorderList {
    private int mCount = 0;
    ListNode mDummy = new ListNode('d');
    public ListNode reorderList(ListNode head){
        if( head == null || head.next == null) return head;
        ListNode fast = head, slow = head;
        reorderListRec(mDummy, fast, slow);
        return mDummy.next;
    }

    private ListNode reorderListRec(ListNode head, ListNode fast, ListNode slow){
        if( fast != null){

            head.next = slow;
            slow = slow.next;
            head = head.next;

            fast = fast.next;
            mCount++;
            if(fast != null){
                fast = fast.next;
                mCount++;
            }

            slow = reorderListRec(head,fast,slow);
            if(slow != null) {
                if(mCount %2 == 1){
                    if(head.next != null){
                        ListNode tmp = head.next;
                        head.next = slow;
                        slow = slow.next;
                        head.next.next = tmp;
                    }
                }else {
                    ListNode tmp = head.next;
                    head.next = slow;
                    slow = slow.next;
                    head.next.next = tmp;
                }
            }
        }else {
            head.next = null;
        }

        return slow;

    }
//
//    public ListNode reorderList(ListNode head) {
//        if( head == null || head.next == null) return head;
//
//        ListNode fast = head;
//        ListNode slow = head;
//        ListNode dummy = new ListNode('d');
//        ListNode cur = dummy;
//        while(fast != null){
//            cur.next = slow;
//            cur = cur.next;
//            slow = slow.next;
//            fast = fast.next;
//            if(fast != null){
//                fast = fast.next;
//            }
//
//        }
//        cur.next = null;
//        slow = LinkedList.getReverseList(slow);
//        cur = dummy.next;
//        while (slow != null){
//            ListNode tmp = cur.next;
//            cur.next = slow;
//            slow = slow.next;
//            cur.next.next = tmp;
//            cur = cur.next.next;
//        }
//
//        return dummy.next;
//    }

}
