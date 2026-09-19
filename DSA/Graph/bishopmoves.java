public class bishop{
    int n=8;
    public int encode(int x,int y){
        return x*n+y;
    }

    public int moves(int[] src,int[] dest){
        int[] dist=new dist[n*n];
        int s=encode(x,y);
        dist[s]=0;
        int[][] dirs={{-1,-1},{1,1},{1,-1},{-1,1}};
         
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->(a[1]-b[1]));
        pq.offer(s,0);int best=0;
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int d=curr[0];int cost=curr[1];

            
            if(cost>dist[d]) continue;
            int r=d/n;int c=d%n;
            if(r==dest[0]&&c==dest[1]) return best;
            for(int[] dir:dirs){
                int nr=r+dir[0];
                int nc=c+dir[1];
                while(nr>=0&&nc>=0&&)
            }

        }
        


    }
}