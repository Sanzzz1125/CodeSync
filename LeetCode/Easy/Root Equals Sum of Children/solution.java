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
    static int sum=0;
    void preorder(TreeNode root){
        if(root == null) return;

        if(root.left==null && root.right==null) sum+=root.val;
        preorder(root.left);
        preorder(root.right);
    }
    public boolean checkTree(TreeNode root) {
        sum=0;
        preorder(root);
        return (root.val == sum);
    }
}