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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;

        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }

        k = k%size;
        while(k!=0){
            ListNode tail = head, prev = null;
            while(tail.next!=null){
                prev = tail;
                tail = tail.next;
            }
            prev.next = null;
            tail.next = head;
            head = tail;
            k--;
        }
        
        return head;
    }
}