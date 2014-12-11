package com.company.RemoveDuliList;

import com.company.Models.ListNode;

/**
 * Created by hanh on 12/11/2014.
 */

// accepted
public class RemoveDupliList {

    public static ListNode deletDuplicaties(ListNode head){

        if( head == null || head.next == null){
            return head;
        }

        ListNode current = head;

        for(;current.next != null;){
            if(current.val == current.next.val){
                current = removeNode(current);
            } else {
                current = current.next;
            }

        }

        return head;
    }

    private static ListNode removeNode(ListNode ln){
        ln.next = ln.next.next;
        return ln;
    }

}
