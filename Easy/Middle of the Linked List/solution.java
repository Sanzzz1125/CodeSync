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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
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
            temp=temp.next;
        }
        head = temp;
        return head;
    }
}