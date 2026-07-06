import java.util.*;
class Solution{
    public void helper(int[] candidates,int idx,List<List<Integer>> ans,List<Integer> nums,int target){
        if(target==0)
        {
            ans.add(new ArrayList<>(nums));
            return;
        }
        if(target<0||idx==candidates.length) return;
        nums.add(candidates[idx]);
        helper(candidates,idx+1,ans,nums,target-candidates[idx]);
        nums.remove(nums.size()-1);
        
        while(idx+1<candidates.length&&candidates[idx]==candidates[idx+1]) idx++;
        helper(candidates,idx+1,ans,nums,target);
    }
    public List<List<Integer>> answer(int[] candidates,int target){
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> nums=new ArrayList<>();
        helper(candidates,0,ans,nums,target);
        return ans;
    }
}
class Solution2{
    public void ans2(int[] candidates,int target,List<List<Integer>> ans,List<Integer> ds,int idx){
        if(idx==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
                return;
            }
        }
        if(target>=candidates[idx]){
            ds.add(candidates[idx]);
            ans2(candidates,target-candidates[idx],ans,ds,idx);
            ds.remove(ds.size()-1);
        }
        ans2(candidates,target,ans,ds,idx+1);
    }
    public List<List<Integer>> answer(int[] candidates,int target){
        
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> nums=new ArrayList<>();
        ans2(candidates,target,ans,nums,0);
        return ans;
    }
}