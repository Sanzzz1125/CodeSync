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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> ls =new ArrayList<>();
        ListNode temp=head;
         while (temp != null) {
            ls.add(temp.val);
            temp = temp.next;
        }
        int n =ls.size();
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= ls.get(i)) {
                st.pop();
            }

            result[i] = st.isEmpty() ? 0 : st.peek();
            st.push(ls.get(i));
        }

        return result;
    }
}