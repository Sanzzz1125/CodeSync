/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA, l2 = headB;
        int len1=0, len2=0;
        while(l1!=null){
            len1++;
            l1 = l1.next;
        }
        while(l2!=null){
            len2++;
            l2 = l2.next;
        }
        l1 = headA;
        l2 = headB;
        while(len1>len2){
            l1 = l1.next;
            len1--;
        }
        while(len2>len1){
            l2 = l2.next;
            len2--;
        }
        while(l1!=l2){
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1;
    }
}