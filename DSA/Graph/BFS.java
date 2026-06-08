class Solution{
    public List<Integer> bfs(int V,List<List<Integer>> adj){
        List<Integer> bfs=new ArrayList<>();
        boolean[] visited=new boolean[V];
        Queue<Integer> q=new LinkedList<>();
        q.offer(0);
        visited[0]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            bfs.add(node);
            
            for(int num:adj.get(node)){
                if(!visited[num]){
                    q.offer(num);
                    visited[num]=true;

                }

            }
        }
        return bfs;
    }
}