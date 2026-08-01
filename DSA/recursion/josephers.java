public int solve(List<Integer> arr,int k,int idx){
    if(arr.size()==1)
    return arr.get(0);
    idx=(idx+k-1)%arr.size();
    arr.remove(idx);
    return solve(arr,k,idx);
}