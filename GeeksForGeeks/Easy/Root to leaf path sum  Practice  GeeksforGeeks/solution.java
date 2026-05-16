/*
// A Binary Tree node
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    public void dfs(Node root, int sum, Set<Integer> set){
        if(root == null) return;

        sum += root.data;

        if(root.left == null && root.right == null){
            set.add(sum);
            return;
        }

        dfs(root.left, sum, set);
        dfs(root.right, sum, set);
    }
    
    boolean hasPathSum(Node root, int target) {
        Set<Integer> set = new HashSet<>();
        dfs(root, 0, set );
        return (set.contains(target));
    }
}