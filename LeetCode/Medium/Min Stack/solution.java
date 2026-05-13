class MinStack {
    static class Node{
        int min;
        int val;
        Node next;
        
        Node(int val,int min){
            this.min=min;
            this.val=val;
        }
    }
    public Node head;
    public MinStack(){}
    
    public void push(int val) {
        if(head==null){
            head=new Node(val,val);
        }else{
            Node curr=new Node(val,Math.min(val,head.min));
            curr.next=head;
            head=curr;
        }
    }
    
    public void pop() {
        head=head.next;
    } 
    public int top() {
        return head.val;
    }
    public int getMin() {
        return head.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */