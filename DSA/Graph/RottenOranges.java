class Solution{
    public int time(int[][] grid){
        int m=grid.length;
        int n=grid[0].length;
        int fresh=0;int minutes=0;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1)
                fresh++;
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }

            }
        }
        if(fresh==0) return 0;
        //directions array
        int[][] dir={{-1,0},{0,1},{0,-1},{1,0}};
        while(!q.isEmpty()){
            int size=q.size();
            boolean isrotten=false;
            for(int i=0;i<size;i++){
                int[] curr=q.poll();
                int r=curr[0];
                int c=curr[1];
                for(int[] d:dir){
                    int nr=r+d[0];
                    int nc=c+d[1];
                    if(nr>=0&&nr<m&&nc>=0&&nc<n&&grid[nr][nc]==1){
                        grid[nr][nc]=2;
                        q.offer(new int[]{nr,nc});
                        isrotten=true;
                        fresh--;
                    }
                }
            }
            if(isrotten) minutes++;
        }
        return fresh==0?minutes:-1;
    }
}