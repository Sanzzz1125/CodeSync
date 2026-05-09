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
    public void reorderList(ListNode head) {
        if(head==null) return;
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int arr[] = new int[size];
        int i = 0, end = size-1;
        temp = head;
        while(temp!=null){
            arr[i++] = temp.val;
            temp = temp.next;
        }

        temp = head;
        i=0;
        while(i<=end && temp!=null){
            temp.val = arr[i++];
            temp = temp.next;
            if(temp!=null){
                temp.val = arr[end--];
                temp = temp.next;
            }
        }
    }
}