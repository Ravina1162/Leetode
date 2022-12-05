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
    public ListNode middleNode(ListNode head) {
        int size = 0;
    ListNode CurrNode = head;
    while(CurrNode.next != null)
    {
        CurrNode = CurrNode.next;
        ++size;     
    }
       if(size%2==0)
           size=size/2;
        else
            size=size/2+1;
       //size/=2;
        while(size!=0)
        {
            head=head.next;
            --size;
        }
        return head;
    }
}