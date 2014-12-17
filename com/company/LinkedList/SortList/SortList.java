package com.company.LinkedList.SortList;

import com.company.Models.ListNode;

/**
 * Created by hanh on 12/17/2014.
 */
//Sort a linked list in O(n log n) time using constant space complexity.
public class SortList {
    public ListNode sortList(ListNode head) {
        ListNode node = head;

        return head;
    }

    private ListNode sortSubList(ListNode head, int step){
        ListNode node = head;
        while(node != null && node.next != null){
            if( node.val > node.next.val){
                int tmp = node.val;
                node.val = node.next.val;
                node.next.val = tmp;
            }
            node = node.next;
            if(node != null){
                node = node.next;
            }
        }
        return  head;
    }
}
