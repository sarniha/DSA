class Solution{
    public boolean iscycle(int src,boolean[] vis,List<List<Integer>> adj,int V){
        Queue<Node> q=new LinkedList<>();
        vis[src]=true;
        q.offer(new Node(src,-1));
        while(!q.isEmpty()){
            Node curr=q.poll();
            int n=curr.node;
            int par=curr.parent;
            for(int ele:adj.get(n)){
                if(!vis[ele]){
                    vis[ele]=true;
                    q.offer(new Node(ele,n));
                }
                else{
                    if(ele!=par)
                    return true;
                }
            }
        }
        return false;
    }
    public boolean hascycle(int V,List<List<Integer>> adj){
        boolean[] vis=new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                if(iscycle(i,vis,adj,V)) return true;
            }
            
        }
        return false;
    }
}
class Node{
    int node;int parent;
    Node(int node,int parent){
        this.node=node;
        this.parent=parent;
    }
}