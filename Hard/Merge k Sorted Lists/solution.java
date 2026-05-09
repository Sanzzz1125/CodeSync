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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ListNode temp = lists[i];
            while(temp!=null){
                list.add(temp.val);
                temp = temp.next;
            }
        }
        Collections.sort(list);

        ListNode newList = new ListNode(0);
        ListNode dummy = newList;
        for(int i=0;i<list.size();i++){
            ListNode node = new ListNode(list.get(i));
            dummy.next = node;
            dummy = dummy.next;
        }
        return newList.next;
    }
}