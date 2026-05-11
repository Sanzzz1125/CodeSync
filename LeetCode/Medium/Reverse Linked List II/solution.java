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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int[] arr = new int[right-left+1];
        ListNode temp = head;
        int size = 0;
        
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int k=0;
        temp = head;

        for(int i=1;temp!=null;i++){
            if(i>=left && i<=right){
                arr[k++] = temp.val;
            }
            temp = temp.next;
        }

        temp = head;
        k--;

        for(int i=1;temp!=null;i++){
            if(i>=left && i<=right){
                temp.val = arr[k--];
            }
            temp = temp.next;
        }

        return head;
    }
}