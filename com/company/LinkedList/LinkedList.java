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
        while(ln != null){
            if(ln.next == null){
                break;
            }
            ln = ln.next.next;
            mid = mid.next;
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
        ListNode slow = ln;
        ListNode fast = ln;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    public static ListNode detectCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }

        slow = head;
        while (fast != null && fast.next != null){
            if(fast == slow){
                return fast;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return null;
    }

//    Given a linked list, remove the nth node from the end of list and return its head.
//
//    For example,
//
//    Given linked list: 1->2->3->4->5, and n = 2.
//
//    After removing the second node from the end, the linked list becomes 1->2->3->5.
//    Note:
//    Given n will always be valid.
//    Try to do this in one pass.
    public static ListNode removeNthFromEnd(ListNode head, int n){
        if(head == null || n <= 0) return head;

        ListNode oldHead = head;
        ListNode rmNode = head;
        int dist = 0;
        while(head != null){
            head = head.next;
            if(dist < n+1){
                dist++;
            }else {
                rmNode = rmNode.next;
            }
        }

        if(dist < n){
            return oldHead;
        }else if(dist == n){
            return oldHead.next;
        }

        rmNode.next = rmNode.next.next;
        return oldHead;
    }

//    Reverse a linked list from position m to n. Do it in-place and in one-pass.
//
//    For example:
//    Given 1->2->3->4->5->NULL, m = 2 and n = 4,
//
//    return 1->4->3->2->5->NULL.
//
//            Note:
//    Given m, n satisfy the following condition:
//            1 ≤ m ≤ n ≤ length of list.
    public static ListNode reverseBetween(ListNode head, int m, int n){

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = dummy;
        for(int i = 1; i < m; i++)
            p = p.next;

        p.next = reverse(p.next, n - m + 1);
        return dummy.next;


    }


    private static ListNode reverse(ListNode head, int n){
        ListNode node = head, prev = null, next = null;
        for(int i = 0; i < n; i++){
            next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        head.next = node;
        return prev;
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
















