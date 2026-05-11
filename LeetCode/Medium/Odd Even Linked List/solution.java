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
    public ListNode oddEvenList(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int odd = 0;
        int even = (size+1)/2;
        int arr[] = new int[size];
        temp = head;
        for(int i=1; temp!=null && i<=size; i++) {
            if(i%2 == 0) {
                arr[even++] = temp.val;
            }else{
                arr[odd++] = temp.val;
            }
            temp = temp.next;
        }
        temp = head;
        for(int i=0; temp!=null && i<size; i++) {
            temp.val = arr[i];
            temp = temp.next;
        }
        return head;
    }
}