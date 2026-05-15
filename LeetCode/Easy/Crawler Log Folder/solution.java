class Solution {
    public int minOperations(String[] logs) {
        int moves = 0;
        for(int i=0;i<logs.length;i++){
            if(logs[i].equals("./")) continue;
            else if(logs[i].equals("../")){
                if(moves > 0){
                    moves--;
                }
            }else{
                moves++;
            }
        }
        return moves;
    }
}