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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1;
        ListNode break1 = null;
        ListNode join1 = null;

        int i=0;
        while(temp!= null){
            if(i == a-1){
                break1 = temp;
            }
            if(i == b){
                join1 = temp.next;
            }
            temp = temp.next;
            i++;
        }
        break1.next = list2;
        temp = list2;
        while(list2.next!=null){
            list2 = list2.next;
        }
        list2.next = join1;
        return list1;
    }
}