class Solution{
    public int[] shortestpath(int[][] graph){
        ArrayList<Integer>[] adjlist=new ArrayList[graph.length];
        for(int i=0;i<graph.length;i++){
            adjlist[i].add(new ArrayList<>());
        }
        for(int i=0;i<adjlist.length;i++){
            adjlist[graph[i][0]].add(graph[i][1]);
            adjlist[graph[i][1]].add(graph[i][0]);
        }


    }
}