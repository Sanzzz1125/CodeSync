/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
}*/

class Solution {
    static int cnt=0;
    void preorder(Node node){
        if(node == null) return;
        if(node.left==null && node.right == null) cnt++;
        
        preorder(node.left);
        preorder(node.right);
    }
    int countLeaves(Node node) {
        // Your code
        cnt=0;
        preorder(node);
        return cnt;
    }
}