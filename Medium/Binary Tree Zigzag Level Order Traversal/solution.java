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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> finalList = new ArrayList<>();
        if(root == null) return finalList;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i=0;
        while(!q.isEmpty()){
            i++;
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<size;j++){
                if(q.peek()!=null && q.peek().left!=null) q.add(q.peek().left);
                if(q.peek()!=null && q.peek().right!=null) q.add(q.peek().right);
                if(q.peek()!=null){
                    list.add(q.peek().val);
                    q.poll();
                }
            }
            if(i%2==0) Collections.reverse(list);
            if(!list.isEmpty()) finalList.add(list);
        }
        return finalList;
    }
}