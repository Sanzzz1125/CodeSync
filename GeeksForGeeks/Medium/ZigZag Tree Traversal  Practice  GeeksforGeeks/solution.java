/*
class Node {
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        // code here
        ArrayList<Integer> finalList = new ArrayList<>();
        if(root == null) return finalList;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i=0;
        while(!q.isEmpty()){
            i++;
            int size = q.size();
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0;j<size;j++){
                if(q.peek()!=null & q.peek().left!=null) q.add(q.peek().left);
                if(q.peek()!=null & q.peek().right!=null) q.add(q.peek().right);
                if(q.peek()!=null){
                    list.add(q.peek().data);
                    q.poll();
                }
            }
            if(i%2==0) Collections.reverse(list);
            
            if(!list.isEmpty()) finalList.addAll(list);
        }
        
        return finalList;
    }
}