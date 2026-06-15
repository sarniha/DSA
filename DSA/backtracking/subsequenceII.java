class Solution{
    public boolean helper(int[] nums,int target,int idx){
        
        if(target<0||idx==nums.length){
            return false;

        }
        if(target==0){
            
            return true;
        }
       return  helper(nums,target-nums[idx],idx+1)||
        helper(nums,target,idx+1);
        


        


    
    }
    public boolean subsequence(int[] nums,int target){
        
        int idx=0;
        return helper(nums,target,0);
        
    }
}