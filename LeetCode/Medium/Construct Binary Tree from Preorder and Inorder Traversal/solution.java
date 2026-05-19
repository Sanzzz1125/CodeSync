class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return constructTree(preorder, inorder, map, 0, inorder.length - 1);
    }

    int i = 0;

    public TreeNode constructTree(int[] preorder, int[] inorder, Map<Integer, Integer> map, int start, int end) {
        if (start > end)
            return null;
        TreeNode newNode = new TreeNode(preorder[i]);
        int index = map.get(preorder[i]);
        i++;

        newNode.left = constructTree(preorder, inorder, map, start, index - 1);
        newNode.right = constructTree(preorder, inorder, map, index + 1, end);
        return newNode;
    }

}