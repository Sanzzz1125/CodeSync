class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n = graph.length;
        int target = n-1;

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<>();
        dfs(0, graph, path, result);

        return result;
    }

    public void dfs(int node, int[][] graph, List<Integer> path, List<List<Integer>> result){
        if(node == graph.length - 1){
            path.add(node);
            result.add(new ArrayList<Integer>(path));
            return;
        }

        path.add(node);
        for(int neighbour : graph[node]){
            dfs(neighbour, graph, path, result);
            
        path.remove(path.size() - 1);
        }
    }
}