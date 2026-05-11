/*
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}
*/

class Solution {
    public boolean isPerfect(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i=0;
        
        while(!q.isEmpty()){
            i++;
            int size = q.size();
            for(int j=0;j<size;j++){
                if ((q.peek().left == null && q.peek().right != null) || (q.peek().left != null && q.peek().right == null)){
                    return false;
                }
                if(q.peek().left==null && q.peek().right==null) list.add(i);
                
                if(q.peek().left!=null) q.add(q.peek().left);
                if(q.peek().right!=null) q.add(q.peek().right);
                if(q.peek()!=null){
                    q.poll();
                }
            }
        }
        
        for(int j=0;j<list.size()-1;j++){
            if(list.get(j)!=list.get(j+1)) return false;
        }
        
        return true;
    }
}