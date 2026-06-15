class Solution{
    public int helper(int[] nums,int target,int idx){
        
        if(target<0||idx==nums.length){
            return 0;

        }
        if(target==0){
            
            return 1;
        }
        int take=helper(nums,target-nums[idx],idx+1);
        int notTake=helper(nums,target,idx+1);
        return take+notTake;


        


    
    }
    public int subsequence(int[] nums,int target){
        
        int idx=0;
        return helper(nums,target,0);
        
    }
}