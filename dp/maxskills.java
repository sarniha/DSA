int[][][] dp=new int[101][101][101];
for(int[] d: dp)
Arrays.fill(d,-1);
public int rec(int level,int timetaken,int itemtaken){
    //level->current item in [0...n-1]


    //pruning

    //basecase
    if(level==n){
        return 0;
    }
    //cache check
    if(dp[level][timetaken][itemtaken]!=-1){
        return dp[level][timetaken][itemtaken];
    }

    //compute/transition
    int ans=rec(level+1,timetaken,itemtaken);
    if(timetaken+t[level]<=x&&itemtaken+1<=k){
        ans=Math.min(ans,s[level]+rec(level+1,timetaken+t[level],itemtaken+1));

    }


    //save and return
    return dp[level][timetaken][itemtaken]=ans;


    
}