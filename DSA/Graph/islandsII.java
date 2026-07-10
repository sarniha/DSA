import java.util.*;
class Dsu{
    int[] parent;
    int[] size;
    Dsu(int n){
        parent=new int[n];
        size=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
            size[i]=1;
        }
    }
    public int find(int node){
        if(parent[node]==node) return node;
        return parent[node]=find(parent[node]);
    }
    public boolean union(int u,int v){
        int parU=find(u);
        int parV=find(v);
        if(parU==parV) return false;
        if(size[parU]<size[parV]){
            parent[parU]=parV;
            size[parV]+=size[parU];
        }
        else{
            parent[parV]=parU;
            size[parU]+=size[parV];

        }
        return true;
    }
}
class Solution{
    public List<Integer> number(int n,int m,int[][] A){
        List<Integer> ans=new ArrayList<>();
        Dsu ds=new Dsu(n*m);int count=0;
        boolean[][] land=new boolean[n][m];
        int[][] dir={{-1,0},{0,-1},{0,1},{1,0}};
        for(int[] curr:A){
            int r=curr[0];
            int c=curr[1];
            int node=r*m+c;
            if(land[r][c]){ 
                ans.add(count);
                 continue;
            }
            land[r][c]=true;
            count++;
            for(int[] d:dir){
                int dr=d[0]+r;
                int dc=d[1]+c;
                if(dr<0||dc<0||dr>=n||dc>=m) continue;
                if(!land[dr][dc])  continue;
                int adjNode=dr*m+dc;
                if(ds.union(node,adjNode)) count--;
                

            }
            ans.add(count);
        }
        return ans;
    }
}