class DSU{
    int[] rank;
    int[] parent;
    DSU(int n){
       rank= new int[n];
        parent=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
    }
    public int find(int node){
        if(parent[node]==node) return node;
        return parent[node]=find(parent[node]);
    }
    public void union(int v,int u){
        int parentU=find(u);
        int parentV=find(v);
        if(rank[parentU]>rank[parentV])
        parent[parentV]=parentU;
        else if(rank[parentU]<rank[parentV])
        parent[parentU]=parentV;
        else{
            parent[parentV]=parentU;
            rank[parentU]++;
        }
    }
    
    }
    
    class Solution{
    public int makeConnected(int n,int[][] connections){
        if(connections.length<n-1) return -1;
        DSU d=new DSU(n);
        for(int[] connection:connections){
            d.union(connection[0],connection[1]);

        }
        
        int num=parent[0];int count=0;
        for(int i=0;i<n;i++){
            if(ds.find(i)==i) count++;

            
        }
        return count-1;

    }
}