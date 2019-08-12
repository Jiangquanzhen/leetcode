package com.N20TO30;

import com.N10TO20.ListNode;

public class N23 {
    public ListNode mergeKLists(ListNode[] lists) {

        ListNode heads = new ListNode(-1);
        ListNode flag = heads;
        int endFlag = 0;
        while( endFlag < lists.length){
            int minval = Integer.MAX_VALUE;
            int minposi = 0;
            endFlag = 0;
            for (int i = 0;i<lists.length ;i++){
                if(lists[i] != null && minval > lists[i].val){
                    minval = lists[i].val;
                    minposi = i;
                }
                if(lists[i] == null){
                    endFlag +=1;
                }

            }

            flag.next = lists[minposi];
            flag = flag.next;
            if(lists[minposi] != null){
                lists[minposi] = lists[minposi].next;
            }

        }


        return heads.next;
    }
}
