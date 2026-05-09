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
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        int len = 0;
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        int arr[] = new int[len];
        int i=0;
        temp = head;
        while(temp!=null && i<arr.length){
            arr[i] = temp.val;
            temp = temp.next;
            i++;
        }
        temp = head;
        i = arr.length-1;
        while(temp!=null && i>=0){
            temp.val = arr[i];
            temp = temp.next;
            i--;
        }
        return head;
    }
}