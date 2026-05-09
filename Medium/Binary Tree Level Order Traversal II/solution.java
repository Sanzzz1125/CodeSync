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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> al = new ArrayList<>();
            for(int i=0;i<size;i++){
                if(q.peek()!=null && q.peek().left!=null) q.add(q.peek().left);
                if(q.peek()!=null && q.peek().right!=null) q.add(q.peek().right);
                if(q.peek()!=null){
                    al.add(q.peek().val);
                    q.poll();
                }
            }
            if(!al.isEmpty()) ans.addFirst(al);
        }
        return ans;
    }
}

// class Solution {
//     public List<List<Integer>> levelOrderBottom(TreeNode root) {
//         //LinkedList<List<Integer>> result = new LinkedList<>();
//         List<List<Integer>> result = new ArrayList<>();
//         if (root == null) return result;

//         Queue<TreeNode> queue = new LinkedList<>();
//         queue.add(root);

//         while (!queue.isEmpty()) {
//             int size = queue.size();
//             List<Integer> level = new ArrayList<>();

//             for (int i = 0; i < size; i++) {
//                 TreeNode node = queue.poll();
//                 level.add(node.val);

//                 if (node.left != null) queue.add(node.left);
//                 if (node.right != null) queue.add(node.right);
//             }

//             result.addFirst(level);
//         }

//         return result;
//     }
// }