package com.N10TO20;

public class N19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode endFlag = head;
        ListNode deleteFlag = head;
        int i = 0;
        while(endFlag.next != null){
            if( i < n){
                endFlag = endFlag.next;
                i++;
            }else{

                deleteFlag = deleteFlag.next;
                endFlag = endFlag.next;
            }

        }
        if(deleteFlag.next == null){
            return null;
        }
        if(i < n){
            return head.next;
        }
        deleteFlag.next = deleteFlag.next.next;

        return head;
    }
}
