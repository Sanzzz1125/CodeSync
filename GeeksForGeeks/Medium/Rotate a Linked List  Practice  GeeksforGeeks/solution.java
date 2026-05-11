/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        // code here
        if (head == null || head.next == null) return head;
        
        Node temp = head;
        int size = 1;
        while (temp.next!= null) {
            size++;
            temp = temp.next;
        }
        k = k % size;
        if(k==0) return head;
        
        temp.next = head;
        Node latest = head;
        for(int i=1;i<k;i++){
            latest = latest.next;
        }
        
        Node newNode = latest.next;
        latest.next = null;
        return newNode;
    }
}