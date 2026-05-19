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
    int maxSum = 0;

    class Node {
        boolean valid;
        int min;
        int max;
        int sum;

        Node(boolean valid, int min, int max, int sum) {
            this.valid = valid;
            this.min = min;
            this.max = max;
            this.sum = sum;
        }
    }

    public int maxSumBST(TreeNode root) {
        postOrder(root);
        return maxSum;
    }

    public Node postOrder(TreeNode root) {

        if (root == null) {
            return new Node(true, Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        }

        Node left = postOrder(root.left);
        Node right = postOrder(root.right);

        if (left.valid && right.valid &&
            left.max < root.val && root.val < right.min) {

            int sum = left.sum + root.val + right.sum;

            maxSum = Math.max(maxSum, sum);

            int min = Math.min(root.val, left.min);
            int max = Math.max(root.val, right.max);

            return new Node(true, min, max, sum);
        }

        return new Node(false, Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
    }
}