package com.company.LinkedList.RemoveDuliList;

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
//    Given a sorted linked list, delete all nodes that have duplicate numbers,
//    leaving only distinct numbers from the original list.
//
//    For example,
//    Given 1->2->3->3->4->4->5, return 1->2->5.
//    Given 1->1->1->2->3, return 2->3.
    public ListNode deleteDuplicates2(ListNode head) {
        if( head == null){
            return head;
        }
        ListNode dummy = new ListNode('d');
        ListNode prev = dummy;
        dummy.next = head;
        ListNode node = head;

        while(node != null && node.next != null){
            if(node.val != node.next.val){
                prev = node;
                node = node.next;
            }else {
                while ( node.next != null && node.val == node.next.val){
                    node.next = node.next.next;
                }

                prev.next = node.next;
                node = node.next;

            }
        }

        return dummy.next;
    }

    private static ListNode removeNode(ListNode ln){
        ln.next = ln.next.next;
        return ln;
    }

}
