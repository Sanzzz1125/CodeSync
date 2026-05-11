/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int matrix[][] = new int[m][n];
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        int num=1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                if(head!=null){
                    matrix[top][i] = head.val;
                    head = head.next;
                }else{
                    matrix[top][i] = -1;
                }
            }
            top++;

            for(int j=top;j<=bottom;j++){
                if(head!=null){
                    matrix[j][right] = head.val;
                    head = head.next;
                }else{
                    matrix[j][right] = -1;
                }
            }
            right--;

            if(top<=bottom){
                for(int k = right;k>=left;k--){
                    if(head!=null){
                        matrix[bottom][k] = head.val;
                        head = head.next;
                    }else{
                        matrix[bottom][k] = -1;
                    }
                }
                bottom--;
            }

            if(left<=right){
                for(int l=bottom;l>=top;l--){
                    if(head!=null){
                        matrix[l][left] = head.val;
                        head = head.next;
                    }else{
                        matrix[l][left] = -1;
                    }
                }
                left++;
            }
        }
        return matrix;
    }
}