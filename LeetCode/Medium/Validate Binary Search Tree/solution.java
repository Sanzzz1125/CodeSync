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
    public boolean isValidBST(TreeNode root) {
        if (root.left != null && root.left.val > root.val || root.right != null && root.right.val < root.val
                || root.left != null && root.left.val == root.val || root.right != null && root.right.val == root.val)
            return false;

        return traverse(root.left) && traverse(root.right);
    }

    public boolean traverse(TreeNode root) {
        if (root == null)
            return true;

        if (root.left != null && root.left.val > root.val || root.right != null && root.right.val < root.val)
            return false;
        return true;
    }
}