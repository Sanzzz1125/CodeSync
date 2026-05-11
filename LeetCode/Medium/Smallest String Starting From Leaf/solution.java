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
    static String prev= "~";
    void dfs(TreeNode root, String curr){
        if(root == null) return;

        char c = (char) ('a' + root.val);
        curr = c + curr;

        if(root.left == null && root.right == null){
             if (curr.compareTo(prev) < 0) {
                prev = curr;
            }
            return;
        }
        dfs(root.left, curr);
        dfs(root.right, curr);
    }
    public String smallestFromLeaf(TreeNode root) {
        prev = "~";
        dfs(root, "");
        return prev;
    }
}