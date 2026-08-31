class Solution{
    public int sum(int n){
        if(n==0) return 0;
        return sum(n-1)+n;
    }
}