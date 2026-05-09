class Solution {
    public String winningPlayer(int x, int y) {
        int com = Math.min(x,y/4);
        return (com%2==0)? "Bob" : "Alice";
    }
}