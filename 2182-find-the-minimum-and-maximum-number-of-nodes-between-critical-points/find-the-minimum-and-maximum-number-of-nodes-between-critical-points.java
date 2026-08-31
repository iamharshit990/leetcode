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
    public boolean isCritical(ListNode prev , ListNode curr,ListNode ahead){
        if(prev==null||curr==null||ahead==null) return false;
        if(curr.val<prev.val&&curr.val<ahead.val) return true;
        if(curr.val>prev.val&&curr.val>ahead.val) return true;
        return false;
    }
    public int[] nodesBetweenCriticalPoints(ListNode head) {
       ListNode prev = null;
       ListNode curr = head;
       int max = 0;
       int min = Integer.MAX_VALUE;
       int total=0;
       int index = 1;
       int prev_index = 0;
       int curr_index= 0;
       ListNode firstCritical = null;
       ListNode currCritical = null;
       ListNode prevCritical = null;
       int first_index = 0;
       while(curr.next!=null&&curr.next.next!=null&&curr!=null){
        prev = curr;
        curr=curr.next;
        ListNode ahead = curr.next;
        if(isCritical(prev,curr,ahead)){
            if(firstCritical==null) {
                firstCritical = curr;
                currCritical = curr;
                curr_index = index;
                first_index = index;
            }
            else {
                prev_index = curr_index;
                curr_index = index;
                prevCritical = currCritical;
                currCritical = curr;
                min = Math.min(min,curr_index-prev_index);
            }
            total++;
        }
        index++;
        
       }
       max = curr_index-first_index;
       if(total<2) return new int[]{-1,-1};
       return new int[]{min,max};

    }
}