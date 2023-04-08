package test;

import basicModels.ListNode;

public class ListNodeTestUtils {

    public static boolean equals(ListNode l1, ListNode l2) {
        if (null == l1 && null == l2) {
            return true;
        }
        if (null == l1 || null == l2) {
            return false;
        }
        if (l1.val != l2.val) {
            return false;
        }
        return equals(l1.next, l2.next);
    }
}
