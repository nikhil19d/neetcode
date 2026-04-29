/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode cur = head;
        while(cur != null){
            len++;
            cur = cur.next;
        }
        cur = head;
        int i = 0, ind = len - n - 1;
        if(ind < 0) return cur.next;
        System.out.println(ind);
        while(head != null){
            if(i == ind){
                head.next = head.next.next;
            };
            i++;
            head = head.next;
        }
        return cur;
    }
}
