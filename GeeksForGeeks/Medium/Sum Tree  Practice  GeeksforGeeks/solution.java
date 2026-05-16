/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    int sum(Node root){
        if(root==null) return 0;
        
        if(root.left==null && root.right==null){
            return root.data;
        }
        int left=sum(root.left);
        
        if(left==-1){
            return -1;
        }
        int right=sum(root.right);
        
        if(right==-1){
            return -1;
        }
        
        if(root.data!=left+right){
            return -1;
        }
        
        return root.data+left+right;
    }
    boolean isSumTree(Node root) {
        
        return sum(root)!=-1;
    }
}