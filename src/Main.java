

import com.N10TO20.*;
import com.N20TO30.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        N24 n = new N24();

        ListNode[] list = new ListNode[3];

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        list[0] = n1;

//        ListNode n4 = new ListNode(1);
//        ListNode n5 = new ListNode(3);
//        ListNode n6 = new ListNode(4);
//        n4.next = n5;
//        n5.next = n6;
//        list[1] = n4;
//
//        ListNode n7 = new ListNode(2);
//        ListNode n8 = new ListNode(6);
//        n7.next = n8;
//        list[2] = n7;

        ListNode relist = n.swapPairs(n1);
        while (relist != null){
            System.out.println(relist.val);
            relist = relist.next;
        }
    }

}