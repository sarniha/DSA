class Solution{
    public int cure(int l,int k,int m,int n,int d){
        int count=0;
        for(int i=1;i<=d;i++){
            if(i%l==0||i%k==0||i%m==0||i%n==0)
            count++;
        }
        return count;

    }
    }
public class insomniacure{
    public static void main(String[] args){
        Solution s=new Solution();
        System.out.print(s.cure(2,3,4,5,24));
    }
}