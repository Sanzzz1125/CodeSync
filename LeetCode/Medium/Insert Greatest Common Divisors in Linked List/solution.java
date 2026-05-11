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
    static int gcd(int a, int b){
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head, prev = null;
        while(temp!=null && temp.next!=null){
            // prev = temp;
            int data = gcd(temp.val,temp.next.val);
            ListNode node = new ListNode(data);
            node.next = temp.next;
            temp.next = node;
            temp = node.next;
        }
        return head;
    }
}