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
//     public List<String> binaryTreePaths(TreeNode root) {
//         List<String> paths = new ArrayList<>();
//         StringBuilder sb = new StringBuilder();
//         computePaths(root, paths, sb);
//         return paths;
//     }

//     private void computePaths(TreeNode root, List<String> paths, StringBuilder sb) {
//         if (root == null) {
//             return;
//         }

//         int len = sb.length();

//         sb.append(root.val);

//         if (root.left == null && root.right == null) {
//             paths.add(sb.toString());
//         } else {
//             sb.append("->");
//             computePaths(root.left, paths, sb);
//             computePaths(root.right, paths, sb);
//         }

//         sb.setLength(len);
//     }
// }


class Solution {
    void dfs(TreeNode root, String curr, List<String> list){
        if(root == null) return;

        curr = curr + root.val;

        if(root.left == null && root.right == null){
            list.add(curr);
            return;
        }

        dfs(root.left, curr + "->", list);
        dfs(root.right, curr + "->", list);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        dfs(root, "", list);
        return list;
    }
}

