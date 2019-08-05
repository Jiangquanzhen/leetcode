package com.N20TO30;

import com.N10TO20.ListNode;

public class N21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }

        ListNode l3 = null;
        if(l1.val < l2.val){
            l3 = l1;
            l1 = l1.next;
        }else{
            l3 = l2;
            l2 = l2.next;
        }
        ListNode l4 = l3;
        while (l1 != null && l2 != null){
            if(l1.val < l2.val){
                l4.next = l1;
                l1 = l1.next;

            }else{
                l4.next = l2;
                l2 = l2.next;
            }
            l4 = l4.next;
        }

        if(l1 == null){
            l4.next = l2;
        }else if(l2 == null){
            l4.next = l1;
        }

        return l3;
    }
}
