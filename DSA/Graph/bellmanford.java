import java.util.*;
class algo{
    static String bellmanford1(int V,int[][] edges,int src){
        int[] dist=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
                dist[src]=0;

        for(int i=0;i<V-1;i++){
            for(int[] edge:edges){
                int s=edge[0];
                int dst=edge[1];
                int wt=edge[2];
                if(dist[s]!=Integer.MAX_VALUE&&dist[s]+wt<dist[dst]){
                    dist[dst]=dist[s]+wt;
                }
            }
        }
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            int wt=edge[2];
            if(dist[u]!=Integer.MAX_VALUE&&dist[u]+wt<dist[v]){
                return "negative cycle found";
            }
        }
        return Arrays.toString(dist);
    }
}
public class bellmanford{
    public static void main(String[] args){
        int V = 4;
        int[][] edges = {
            {0, 1, 4},   // S -> A
            {0, 2, 5},   // S -> B
            {1, 3, 3},   // A -> C
            {2, 1, -2},  // B -> A
            {2, 3, 6}    // B -> C
        };
        algo a=new algo();
        System.out.println(algo.bellmanford1(V,edges,0));

    }
}