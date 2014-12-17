package com.company.LinkedList.AddTwoNumbers;

import com.company.Models.ListNode;

//You are given two linked lists representing two non-negative numbers. The digits are stored in reverse
// order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//
//        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//        Output: 7 -> 0 -> 8
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        int carry = 0;
        while (l1 != null || l2 != null){
            int v1 = l1 == null ? 0 : l1.val;
            int v2 = l2 == null ? 0 : l2.val;

            int val = v1 + v2 + carry;
            if( val > 9 ){
                carry = 1;
                val -= 10;
            }else {
                carry = 0;
            }
            cur.next = new ListNode(val);
            cur = cur.next;

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        if( carry > 0){
            cur.next = new ListNode(carry);
            cur = cur.next;
            cur.next = null;
        }else {
            cur.next = null;
        }
        return dummy.next;
    }
}
