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
    class Node{
        int col,row,val;

        Node(int row, int col, int val){
            this.row = row;
            this.col = col;
            this.val = val;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<Node> list = new ArrayList<Node>();
        dfs(root, list, 0, 0);

        Collections.sort(list,(a,b) -> {
            if(a.col != b.col){
                return a.col - b.col;
            }

            if(a.row != b.row){
                return a.row - b.row;
            }
            return a.val - b.val;
        });

        int prev = Integer.MIN_VALUE;
        for(Node node : list){
            int currCol = node.col;
            if(prev != currCol){
                result.add(new ArrayList<Integer>());
                prev = currCol;
            }
            result.get(result.size() - 1).add(node.val);
        }
        return result;
    }

    public void dfs(TreeNode root, List<Node> list, int row, int col){
        if(root == null) return;

        list.add(new Node(row,col,root.val));
        dfs(root.left, list, row+1, col-1);
        dfs(root.right, list, row+1, col+1);
    }
}