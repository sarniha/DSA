import java.util.*;
class Solution{
    public int minweight(int V,List<List<int[]>>adj,int src){
        boolean[] inMST=new boolean[V];
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->(a[0]-b[0]));
        pq.offer(new int[]{0,src});
        int totalwt=0;
        int edges=0;
        while(!pq.isEmpty()&&edges<V){
            int[] curr=pq.poll();
            int wt=curr[0];
            int u=curr[1];
            if(inMST[u]) continue;
            totalwt+=wt;
            edges++;
            inMST[u]=true;
            for(int[] neigh:adj.get(u)){
                int weight=neigh[1];
                int v=neigh[0];
                if(!inMST[v]){
                    pq.offer(new int[]{weight,v});
                }
            }
        }
        return totalwt;
    }
}
public class prims{
    public static void main(String[] args){
         int V = 8;
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        int[][] edges = {
            {0, 1, 1}, {0, 2, 7}, {1, 3,5},
            {1,4,6}, {2, 3, 2}, {4,6,9}, {4,5,3},{5,7,8},{6,7,4}
        };

        for (int[] e : edges) {
            adj.get(e[0]).add(new int[]{e[1], e[2]});
            adj.get(e[1]).add(new int[]{e[0], e[2]});
        }
        Solution s=new Solution();
        System.out.println(s.minweight(V,adj,0));
    }
}