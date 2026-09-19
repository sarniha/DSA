import java.util.*;
public class form2{
    static int[] dp=new int[10010];
    public static void main(String[] args){
        int[] nums={2,1,5,3,6,7};

        System.out.print(solve(nums));
    }
    
    public static int solve(int[] arr){
        Arrays.fill(dp,-1);
        int best=1;
        for(int i=0;i<arr.length;i++){
            best=Math.max(best,dp[i]);
        }
        return best;
        

    }
    
    public static int rec(int level,int[] arr){
        int n=arr.length;int max=1;
        if(level<0) return 0;
        if(dp[level]!=-1) return dp[level];
        for(int i=0;i<level;i++){
            if(arr[i]<arr[level]){
                max=Math.max(max,1+rec(i,arr));
            


            }
        }
        return dp[level]=max;


    }
}