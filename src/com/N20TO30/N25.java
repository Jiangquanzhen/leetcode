package com.N20TO30;

import com.N10TO20.ListNode;

import java.util.Arrays;

public class N25 {
    public ListNode reverseKGroup(ListNode head, int k) {

        if(k == 1){
            return head;
        }
        if(head == null){
            return head;
        }
        ListNode newHead = new ListNode(-1);
        newHead.next = head;

        ListNode endflag = head;
        for (int i = 1; i < k; i++){
            endflag = endflag.next;
            if(endflag == null){
                return head;
            }
        }
        ListNode temp1 = null;
        ListNode temp2 = null;
        ListNode start = head;
        while (endflag != null){
            for (int i = 1; i < k - 1; i++){
                endflag = endflag.next;
                if(endflag.next == null){
                    return head;
                }
            }
            while (){
                temp1 = start.next;
                temp2 = endflag.next.next;
                head.next = endflag.next;
                endflag.next.next = temp1.next;
                temp1.next = temp2.next;
                endflag.next = temp1;
                temp2.next =

            }
            for (int i = 0; i< k/2;i++){

                temp = head.next;
                head.next = end.next;
                end.next = temp;
            }
        }
        return null;
    }

    public ListNode[] reverse(ListNode head,ListNode end,int k){

        if(head.next == end){
            ListNode[] re = new ListNode[2];
            re[0] = head;
            re[1] = end;
            return re;
        }


        return null;
    }
}
