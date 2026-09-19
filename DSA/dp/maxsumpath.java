public class maxsumpath{
    int[][] dp=new int[1001][1001];
    public static void main(String[] args){

    }
    public int rec(int r,int c,int[][] grid){
        if(r<0||c<0) return Integer.MIN_VALUE;
        if(r==0||c==0) return grid[0][0];
        if(dp[r][c]!=-1){
            return dp[r][c];
        }
        int max=Math.max(rec(r-1,c,grid)+grid[r][c],rec(r,c-1)+grid[r][c]);
        return dp[r][c]=max;
    }
}