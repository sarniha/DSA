class Solution{
        public List<Integer> dfsOfGraph(int V, List<List<Integer>> adj) {
        List<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[V];

        dfs(0, res, adj, visited);

        return res;
    }

    public List<Integer> dfs(int node,List<Integer> res,List<List<Integer>> adj,boolean[] visited){
        res.add(node);
        visited[node]=true;
        for(int num:adj.get(node)){
            if(!visited[num]){
                dfs(num,res,adj,visited);
            }
        }
        return res;

    }
}