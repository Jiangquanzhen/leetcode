package com.N20TO30;

import com.N10TO20.ListNode;

public class N24 {
    public ListNode swapPairs(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode flag = newHead;
        ListNode temp = null;
        while (flag.next != null && flag.next.next != null){
            temp = flag.next;
            flag.next = temp.next;
            temp.next = flag.next.next;
            flag.next.next = temp;
            flag = flag.next.next;
        }

        return newHead.next;
    }
}
