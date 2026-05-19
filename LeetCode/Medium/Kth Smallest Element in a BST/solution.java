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
    int res = 0, i=0;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return res;
    }

    public void inorder(TreeNode root, int k){
        if(root == null){
            return;
        }
        inorder(root.left,k);
        i++;
        if(i == k){
            res = root.val;
        }
        inorder(root.right,k);
    }
}


// class Solution {
//     List<Integer> list = new ArrayList<>();
//     public int kthSmallest(TreeNode root, int k) {
//         inorder(root);
//         return list.get(k-1);
//     }

//     public void inorder(TreeNode root){
//         if(root == null){
//             return;
//         }
//         inorder(root.left);
//         list.add(root.val);
//         inorder(root.right);
//     }
// }