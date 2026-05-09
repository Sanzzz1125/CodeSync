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
    public ListNode mergeNodes(ListNode head) {
        head = head.next;
        ListNode temp = head;
        while (temp != null) {
            ListNode tail = temp;   
            int sum = 0;
            while (tail.val != 0) {
                sum += tail.val;
                tail = tail.next;
            }
            temp.val = sum;   
            temp.next = tail.next;   
            temp = temp.next;
        }
        return head;
    }
}