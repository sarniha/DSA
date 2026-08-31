class Solution{
    public int prod(int[] arr,int idx,int acc){
        if(idx==arr.length) return acc;

        acc*=arr[idx];
        return prod(arr,idx+1,acc);
        
    }
}