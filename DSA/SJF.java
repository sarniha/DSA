import java.util.*;
class Solution{
    public long average(int[] bt){
        Arrays.sort(bt);
        int wt=0;
        float twt=0;int n=bt.length;
        for(int i=1;i<n;i++){
            wt+=bt[i-1];
            twt+=wt;
        }
        return Math.floor(twt/n);
    }
}