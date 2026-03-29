import java.util.*;
class Solution{
    public boolean issafe(char[][] board,int col,int rows,int n){
        for(int j=0;j<n;j++){
            if(board[rows][j]=='Q')
            return false;
        }
        for(int i=rows,j=col;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q')
            return false;

        }
        for(int i=rows,j=col;i<n&&j>=0;i++,j--){
            if(board[i][j]=='Q')
            return false;
        }
        return true;
    }
    public void solve(char[][] board,List<List<String>> ans,int n,int col){
        if(col==n){
            List<String> temp=new ArrayList<>();
            for(int i=0;i<n;i++)
            temp.add(new String(board[i]));
            ans.add(temp);
            return;
        }
        for(int rows=0;rows<n;rows++){
            if(issafe(board,col,rows,n)){
            board[rows][col]='Q';
            solve(board,ans,n,col+1);
            board[rows][col]='.';
            }
        }
    }
    public List<List<String>> nquee(int n){
        List<List<String>> ans=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        solve(board,ans,n,0);
        return ans;
    }
    }
    public class Nqueens{
    public static void main(String[] args){
        Solution s=new Solution();
        System.out.print(s.nquee(3));
    }
}