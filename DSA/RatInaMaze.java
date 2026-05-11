import java.util.*;
class Solution{
    public boolean issafe(int x,int y,int[][] maze,int[][] visited,int n){
        if(x>=0&&x<n&&y>=0&&y<n&&visited[x][y]==0&&maze[x][y]==1)
        return true;
        return false;
    }


     public void solve(int x,int y,int[][] maze,int[][] visited,String Path,List<String> res,int n){
        if(x==n-1&&y==n-1){
            res.add(Path);
            return;
        }
        visited[x][y]=1;
        if(issafe(x+1,y,maze,visited,n))
        solve(x+1,y,maze,visited,Path+"D",res,n);
        if(issafe(x,y-1,maze,visited,n))
        solve(x,y-1,maze,visited,Path+"L",res,n);
        if(issafe(x,y+1,maze,visited,n))
        solve(x,y+1,maze,visited,Path+"R",res,n);
        if(issafe(x-1,y,maze,visited,n))
        solve(x-1,y,maze,visited,Path+"U",res,n);
        visited[x][y]=0;
     }
    }
    public class RatInaMaze{
    public static void main(String[] args){
        Solution s=new Solution();
        List<String> res=new ArrayList<>();
        String Path="";int n=4;
    

        int[][] maze= {{1, 0, 0, 0} , {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1} };


        int[][] visited=new int[n][n];
        s.solve(0,0,maze,visited,Path,res,n);
        System.out.print(res);

    }
}