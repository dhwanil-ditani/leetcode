class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head, slow = null;
        int idx = 0;

        while (idx < n && fast != null) {
            fast = fast.next;
            idx++;
        }

        slow = head;

        if (fast != null) {
            while (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }
    
            if (slow.next != null) {
                slow.next = slow.next.next;
            } else {
                slow.next = null;
            }
        }
        else  {
            head = head.next;
        }

        return head;
    }
}


public class RemoveNthNodeFromEndOfList {
    
}
