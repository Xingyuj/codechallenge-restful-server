package ethan.ji.code.challenges;

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }

    /**
     * https://leetcode.com/problems/reverse-nodes-in-k-group/
     *
     * @param head
     * @param kGroup
     * @return
     */
    public static ListNode reverseKGroupList(ListNode head, int kGroup) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode prevGroupTail = dummyHead;
        while (head != null) {
            ListNode edge = head;
            for (int i = 0; i < kGroup - 1; i++) {
                edge = edge.next;
                if (edge == null) {
                    prevGroupTail.next = head;
                    return dummyHead.next;
                }
            }
            ListNode nextGroupHead = edge.next;
            prevGroupTail.next = reverseList(head, nextGroupHead);
            prevGroupTail = head;
            head = nextGroupHead;
        }
        return dummyHead.next;
    }

    public static ListNode reverseList(ListNode head, ListNode nextGroupHead) {
        ListNode prev = null;
        while (head != nextGroupHead) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }

    public static void main(String[] args) {

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
