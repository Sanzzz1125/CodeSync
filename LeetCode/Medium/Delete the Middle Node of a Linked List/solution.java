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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode temp = head,prev=null;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        len/=2;
        int i=0;
        temp = head;
        while(i!=len){
            i++;
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        return head;
    }
}