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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode temp = head, first = null, last = null;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        temp = head;
        int start = k, end = size-k+1;
        int i=1;
        while(temp!=null){
            if(i==start){
                first = temp;
            }
            if(i==end){
                last = temp;
            }
            temp = temp.next;
            i++;
        }
        int t = first.val;
        first.val = last.val;
        last.val = t;

        return head;
    }
}