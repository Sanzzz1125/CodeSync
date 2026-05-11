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
    static List<Integer> temp = new ArrayList<>();
    void dfs(TreeNode root, int sum, List<List<Integer>> list, int target){
        if(root == null) return;
        temp.add(root.val);
        sum += root.val;
        if(root.left == null && root.right == null){
            if(sum == target) list.add(new ArrayList<>(temp));
        }

        dfs(root.left,sum,list, target);
        dfs(root.right, sum, list, target);
        
        temp.remove(temp.size() - 1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        dfs(root, 0, list, targetSum);
        return list;
    }
}