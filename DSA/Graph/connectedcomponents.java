import java.util.*;
class Solution{
    public int Components(int m,int[][] edges){
        ArrayList<Integer>[] adjlist=new ArrayList[m];
        for(int i=0;i<m;i++)
        adjlist[i]=new ArrayList<>();
        for(int i=0;i<edges.length;i++){
            adjlist[edges[i][0]].add(edges[i][1]);
            adjlist[edges[i][1]].add(edges[i][0]);   
        }
        int components=0;
        int n=adjlist.length;
        boolean[] visited=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(!visited[i]){
                q.offer(i);
                components++;
                visited[i]=true;

                while(!q.isEmpty()){
                    int node=q.poll();
                    for(int num:adjlist[node]){
                        if(!visited[num]){
                        q.offer(num);
                        visited[num]=true;
                        }

                    }


                }
            }


        }
        return components;
    }
}
public class connectedcomponents {
    public static void main(String[] args) {
        
        int V = 5;

        
        int[][] edges = {{0, 1}, {1, 2}, {3, 4}};

        
        Solution sol = new Solution();

        
        System.out.println("Number of Connected Components: " + sol.Components(V, edges));
    }
}

