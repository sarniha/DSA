public class DSU{
            int[] parent=new int[n+1];
        int[] rank=new int[n+1];

    DSU(int n){
        for(int i=0;i<=n;i++){
            parent[i]=i;
        }
    }
    public int find(int node){
        if (parent[node]==node) return node;
        return parent[node]=find(parent[node]);
    }
    public void union(int u,int v){
        int parU=find(u);
        int parV=find(v);
        if(parU==parV) return;
        if(rank[parU]>rank[parV]){
            parent[parV]=parU;
        }
        else if(rank[parV]>rank[parU]){
                parent[parU]=parV;


        }
        else{
            parent[parV]=parU;
            rank[parU]++;

        }
    }

}