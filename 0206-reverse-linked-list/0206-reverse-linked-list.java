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
    public ListNode reverseList(ListNode head) {
        ListNode Curr=head;
        ListNode prev= null;

        while(Curr!=null){
            ListNode next=Curr.next;
            Curr.next=prev;
            prev=Curr;
            Curr=next;
        }

        return prev;
    }
}