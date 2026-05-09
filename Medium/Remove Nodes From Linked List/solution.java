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
    public ListNode removeNodes(ListNode head) {
        head = reverseList(head);

        int max = 0;
        ListNode temp = head;
        ListNode prev = null;

        while(temp!=null){
            if(temp.val>=max){
                max = temp.val;
                prev = temp;
            }else{
                prev.next = temp.next;
            }
            temp = temp.next;
        }
        return reverseList(head);
    }
    
    static ListNode reverseList(ListNode head){
        ListNode prev = null;
        while(head!=null){
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}