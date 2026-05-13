class SpecialStack {

    static class Node {
        int val;
        int min;
        Node next;

        Node(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }

    Node head;

    public SpecialStack() {
        head = null;
    }

    public void push(int x) {
        if (head == null) {
            head = new Node(x, x);
        } else {
            Node curr = new Node(x, Math.min(x, head.min));
            curr.next = head;
            head = curr;
        }
    }

    public void pop() {
        if (head != null) {
            head = head.next;
        }
    }
    public int peek() {
        if (head == null) {
            return -1;
        }
        return head.val;
    }
    boolean isEmpty() {
        return head == null;
    }
    public int getMin() {
        if (head == null) {
            return -1;
        }
        
        return head.min;
    }
}