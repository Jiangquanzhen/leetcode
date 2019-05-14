/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class ListSum {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int flag = 0;
        int t = l1.val + l2.val;
        if(t >= 10){
            t = t -10;
            flag = 1;
        }
        ListNode ret = new ListNode(t) ;
        ListNode ret1 = ret;
        ret.next = null;
        while(l1.next != null && l2.next != null){
            int l = l1.next.val + l2.next.val + flag;
            flag = 0;
            if(l >= 10){
                l = l -10;
                flag = 1;
            }
            ListNode ret2 = new ListNode(l);
            ret2.next = null;
            ret1.next = ret2;
            ret1 = ret1.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        if(l1.next == null && l2.next == null){
            if(flag == 1){
                ListNode ret2 = new ListNode(1);
                ret2.next = null;
                ret1.next = ret2;
            }
            return ret;
        }
        if (l1.next == null){
            while(l2.next != null){
                int l =  l2.next.val + flag;
                flag = 0;
                if(l >= 10){
                    l = l -10;
                    flag = 1;
                }
                ListNode ret2 = new ListNode(l);
                ret2.next = null;
                ret1.next = ret2;
                ret1 = ret1.next;
                l2 = l2.next;
            }
            if(flag == 1){
                ListNode ret2 = new ListNode(1);
                ret2.next = null;
                ret1.next = ret2;
            }
            return ret;

        }

        if(l2.next == null){
            while(l1.next != null){
                int l =  l1.next.val + flag;
                flag = 0;
                if(l >= 10){
                    l = l -10;
                    flag = 1;
                }
                ListNode ret2 = new ListNode(l);
                ret2.next = null;
                ret1.next = ret2;
                ret1 = ret1.next;
                l1 = l1.next;
            }
            if(flag == 1){
                ListNode ret2 = new ListNode(1);
                ret2.next = null;
                ret1.next = ret2;
            }

            return ret;
        }
        return null;
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}
