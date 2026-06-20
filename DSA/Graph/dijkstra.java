import java.util.*;
class Solution{
    public int[] shortestPath(int src,List<List<int[]>> edges,int V){
        int[] dist=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        PriorityQueue<Node> pq=new PriorityQueue<>((a,b)->
            a.weight-b.weight
        );
        pq.add(new Node(src,0));
        while(!pq.isEmpty()){
            Node curr=pq.poll();
            int weigh=curr.weight;
            for(int[] neigh:edges.get(curr.node)){
                int u=neigh[0];
                int v=neigh[1];
                if(dist[curr.node]+v<dist[u]){
                    dist[u]=dist[curr.node]+v;
                    pq.offer(new Node(u,dist[u]));
                }

                

            }
        }
        return dist;

    }
    class Node{
        int node;
        int weight;
        Node(int node,int weight){
            this.node=node;
            this.weight=weight;
        }
    }
}
public class dijkstra {
    public static void main(String[] args) {
                int V = 4;
        List<List<int[]>> edges = new ArrayList<>();
        for (int i = 0; i < V; i++) edges.add(new ArrayList<>());

        // add edges [neighbor, weight]
        edges.get(0).add(new int[]{1, 1});
        edges.get(0).add(new int[]{3, 4});
        edges.get(1).add(new int[]{0, 1});
        edges.get(1).add(new int[]{2, 2});
        edges.get(2).add(new int[]{1, 2});
        edges.get(2).add(new int[]{3, 1});
        edges.get(3).add(new int[]{0, 4});
        edges.get(3).add(new int[]{2, 1});

        Solution sol = new Solution();
        int[] dist = sol.shortestPath(0, edges, V);

        System.out.println("Shortest distances from node 0:");
        for (int i = 0; i < V; i++) {
            System.out.println("  0 -> " + i + " = " + dist[i]);
        }
    }
}


