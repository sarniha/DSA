class Solution{
    public boolean isbipartite(int[][] graph){
        int n=graph.length;

        int[] color=new int[n];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(color[i]!=0){
                continue;
            }
            q.offer(i);
            color[i]=1;
            while(!q.isEmpty()){
                int curr=q.poll();
                for(int neigh:graph[curr]){
                    if(color[neigh]==0){
                        color[neigh]=-color[curr];
                        q.offer(neigh);
                    }
                    else if(color[neigh]==color[curr]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}