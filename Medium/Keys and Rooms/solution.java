class Solution {
    public void dfs(int room, List<List<Integer>> rooms, boolean[] visited){
        if(visited[room]) return;
        visited[room] = true;
        for(int key: rooms.get(room)){
            dfs(key,rooms,visited);
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        dfs(0,rooms,visited);
        
        for(boolean v: visited){
            if(!v) return false;
        }
        return true;
    }
}