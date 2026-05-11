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
// class Solution {
//     public ListNode doubleIt(ListNode head) {
//         head = reverse(head);
//         int carry = 0;
//         ListNode temp = head;

//         while(temp!=null){
//             int sum = (temp.val*2) + carry;
//             temp.val = sum%10;
//             carry = sum/10;
//             if (temp.next == null) break;
//             temp = temp.next;
//         }
//         if(carry>0){
//             temp.next = new ListNode(carry);
//         }
//         return reverse(head);
//     }

//     static ListNode reverse(ListNode head){
//         ListNode prev = null;
//         ListNode temp = head;

//         while(temp!=null){
//             ListNode node = temp.next;
//             temp.next = prev;
//             prev = temp;
//             temp = node;
//         }
//         return prev;
//     }
// }

class Solution {
    int carr;
    public ListNode doubleIt(ListNode head) {
        carr=0;
        solve(head);
        return (carr==0) ? head : new ListNode(carr, head);
    }
    public void solve(ListNode head){
        if(head==null) return;
        solve(head.next);
        int sum= 2* head.val + carr;
        carr= sum / 10;
        head.val= sum % 10;
    }
}