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


// class Solution {
//     public boolean isUnivalTree(TreeNode root) {
//         return check(root, root.val);
//     }
    
//     private boolean check(TreeNode node, int value) {
//         if (node == null) return true;
//         if (node.val != value) return false;
        
//         return check(node.left, value) && check(node.right, value);
//     }
// }


class Solution {
    public boolean isUnivalTree(TreeNode root) {
        Set<Integer> set = new HashSet<>();
        set.add(root.val);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                if(q.peek().left != null) q.add(q.peek().left);
                if(q.peek().right != null) q.add(q.peek().right);

                if(q.peek() != null){
                    if(!set.contains(q.peek().val)) return false;
                    q.poll();
                }
            }
        }
        return true;
    }
}