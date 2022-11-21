/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode n=head;
        ListNode m=head;
        while(m!=null&&m.next!=null)
        {
            n=n.next;
            m=m.next.next;
            if(m==n)
                return true;
        }
            return false;
    }
}