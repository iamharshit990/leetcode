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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode curr = head;
        ListNode before_left=null;
        for(int i=0;i<left-1;i++){
            before_left=curr;
            curr=curr.next;
        }
        ListNode lnode = curr; 
        ListNode prev = null;
        for(int i=left;i<=right;i++){
            ListNode temp = curr.next;
            curr.next = prev;
            prev=curr;
            curr=temp;
        }
        if(before_left!=null) before_left.next=prev;
        else head=prev;
        lnode.next=curr;
        return head;
        
    }
}