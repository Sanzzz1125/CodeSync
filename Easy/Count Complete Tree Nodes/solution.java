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
    static int cnt=0;
    static void preorder(TreeNode root){
        if(root==null) return;
        
        cnt++;
        preorder(root.left);
        preorder(root.right);
    }
    public int countNodes(TreeNode node) {
        cnt=0;
        preorder(node);
        return cnt;
    }
}