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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode l4=new ListNode();
        ListNode curr =l4;
        int d=0,c=0;
        while(l1!=null||l2!=null)
        {
            d=(l1!=null)?l1.val:0;
            d=(l2!=null)?d+l2.val:d;
            d=d+c;
            c=d/10;
            d=d%10;
           curr.next=new ListNode(d);
            // l4.next=l3;
            curr=curr.next;
            if(l1!=null)
                l1=  l1.next;
            if(l2!=null)
             l2=l2.next;
        }
        if(c>0){
            curr.next=new ListNode(c);
            curr=curr.next;
        }

        return l4.next;
    }
}