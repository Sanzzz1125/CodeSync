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
    void dfs(TreeNode root, int sum, Set<Integer> set){
        if(root == null) return;

        sum += root.val;

        if(root.left == null && root.right == null){
            set.add(sum);
            return;
        }

        dfs(root.left, sum, set);
        dfs(root.right, sum, set);
    }
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        Set<Integer> set = new HashSet<>();
        dfs(root, 0, set );
        return (set.contains(targetSum));
    }
}