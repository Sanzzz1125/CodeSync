/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public int widthOfBinaryTree(TreeNode root) {

        if (root == null) return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int maxWidth = 0;
        while (!q.isEmpty()) {

            int size = q.size();
            List<TreeNode> level = new ArrayList<>();
            boolean hasNonNull = false;

            for (int i = 0; i < size; i++) {

                TreeNode node = q.poll();
                level.add(node);

                if (node != null) {
                    hasNonNull = true;
                    q.offer(node.left);
                    q.offer(node.right);
                } else {
                    q.offer(null);
                    q.offer(null);
                }
            }

            if (!hasNonNull) break;

            int left = 0;
            while (left < level.size() && level.get(left) == null) {
                left++;
            }

            int right = level.size() - 1;
            while (right >= 0 && level.get(right) == null) {
                right--;
            }

            if (left <= right) {
                maxWidth = Math.max(maxWidth, right - left + 1);
            }
        }

        return maxWidth;
    }
}