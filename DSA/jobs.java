class Solution{
    public int[] schedule(int[][] jobs){
        int n=jobs.length;int max=0;int deadline=0;
        int[] ans=new int[2];
        
        Arrays.sort(jobs,(a,b)->Integer.compare(b[2],a[2]));
        for(int i=0;i<n;i++){
            max=Math.max(max,jobs[i][1]);
        }
        int count=0;int profit=0;
        boolean[] check=new boolean[max+1];
        for(int j=0;j<n;j++){
            deadline=jobs[j][1];
            for(int k=deadline;k>=1;k--){
                if(!check[k]){
                    check[k]=true;
                    count++;
                    profit+=jobs[j][2];
                    break;
                }
            }
        }
        ans[0]=count;
        ans[1]=profit;
        return ans;


    }
}
