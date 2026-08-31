class Solution{
    int n;
    int[] p=new int[100100];
    public int rec(int level){
        if(level>n) return 0;
        if(level==n) return 1;
        if(p[level]!=-1){
            return p[level];
        }
        int ans=0;
        for(int step=1;step<=3;step++){
            int ways=rec(level+step);
            ans+=ways;
        }
        p[level]=ans;
        return ans;
    }
    public void solve(){
        Arrays.fill(p,-1);
        rec(1);

    }
    
}