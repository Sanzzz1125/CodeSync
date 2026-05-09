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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast!=null) slow = slow.next;
        ListNode curr = slow;
        ListNode prev = null;
        ListNode next = null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        fast = head;
        while(prev!=null){
            if(fast.val!=prev.val) return false;
            prev = prev.next;
            fast = fast.next;
        }
        return true;
    }
}