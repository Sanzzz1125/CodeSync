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
//     static boolean present(int nums[],int val){
//         int cnt=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==val) return true;
//         }
//         return false;
//     }
//     public ListNode modifiedList(int[] nums, ListNode head) {
//         ListNode temp = head;
//         ListNode newHead = new ListNode(0);
//         ListNode dummy = newHead;
//         while(temp!=null){
//             if(!present(nums,temp.val)){
//                 ListNode node = new ListNode(temp.val);
//                 dummy.next = node;
//                 dummy = dummy.next;
//             }
//             temp = temp.next;
//         }
//         return newHead.next;
//     }
// }

class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums) set.add(num);

        ListNode temp = head;
        ListNode newHead = new ListNode(0);
        ListNode dummy = newHead;

        while(temp!=null){
            if(!set.contains(temp.val)){
                ListNode node = new ListNode(temp.val);
                dummy.next = node;
                dummy = dummy.next;
            }
            temp = temp.next;
        }
        return newHead.next;
    }
}