package com.company.LinkedList;

import com.company.Models.ListNode;

/**
 * Created by hanh on 12/16/2014.
 */
public class LinkedList {


    public static ListNode createList(int [] inputs){

        ListNode head = new ListNode(inputs[0]);
        ListNode current = head;

        for(int i = 1 ; i< inputs.length ; i++){
            ListNode ln = new ListNode(inputs[i]);
            current.next = ln;
            current = ln;
        }
        return head;
    }

    public static void printList(ListNode ln){
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


    public static long getListLength(ListNode ln){
        long count = 0;
        while(ln != null){
            count++;
            ln = ln.next;
        }
        return count;
    }

    public static ListNode getReverseList(ListNode ln){
        if( ln == null) return null;

        ListNode dummy = new ListNode('d');
        ListNode end = new ListNode(ln.val);
        dummy.next = end;
        ln = ln.next;

        while (ln != null){
            ln = insertListNode(dummy,ln);
        }
        return dummy.next;
    }

    public static ListNode getMiddleNode(ListNode ln){
        ListNode mid = ln;
        boolean flag = false;
        while(ln != null){
            ln = ln.next;
            if(flag){
                flag = false;
            }else {
                flag = true;
            }

            if(flag == false){
                mid = mid.next;
            }
        }
        return mid;
    }

    public static ListNode mergeSortedList(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode newHead;
        ListNode curNode;
        if(l1.val < l2.val){
            newHead = l1;
            l1 = l1.next;
        }else {
            newHead = l2;
            l2 = l2.next;
        }

        curNode = newHead;

        for (;l1 != null && l2 != null;){
            if(l1.val < l2.val){
                curNode.next = l1;
                curNode = curNode.next;
                l1 = l1.next;
            }else if(l1.val > l2.val) {
                curNode.next = l2;
                curNode = curNode.next;
                l2 = l2.next;
            }else {
                curNode.next = l1;
                curNode = curNode.next;
                l1 = l1.next;
                curNode.next = l2;
                curNode = curNode.next;
                l2 = l2.next;
            }
        }

        if(l1 != null){
            curNode.next = l1;
        }

        if(l2 != null){
            curNode.next = l2;
        }

        return newHead;
    }

    public static ListNode mergeSortedListRec(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode tmp;
        if(l1.val < l2.val){
            tmp = l1;
            tmp.next = mergeSortedListRec(l1.next, l2);
            return tmp;
        }else if(l1.val > l2.val){
            tmp = l2;
            tmp.next = mergeSortedListRec(l1, l2.next);
            return tmp;
        }else {
            tmp = l1;
            l1 = l1.next;
            tmp.next = l2;
            l2 = l2.next;
            tmp.next.next = mergeSortedListRec(l1, l2);
            return tmp;
        }

    }

    public static boolean hasCycle(ListNode ln){
        return false;
    }

    private static ListNode insertListNode(ListNode dest, ListNode source){
        if(dest.next == null){
            dest.next = source;
            return source.next;
        }


        ListNode tmp = dest.next;
        dest.next = source;
        source = source.next;
        dest.next.next = tmp;
        return source;
    }
}
















