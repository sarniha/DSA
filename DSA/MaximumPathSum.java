class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
        left=null;
        right=null;
    }
    
}
class Solution{
    int maxsum=0;
    public int ans(TreeNode root){
        if(root==null) return 0;
        maxpathsum(root);
        return maxsum;
    }
    public int maxpathsum(TreeNode root){
        if(root==null)
        return 0;
        int leftR=Math.max(0,maxpathsum(root.left));
        int rightR=Math.max(0,maxpathsum(root.right));
        maxsum=Math.max(maxsum,leftR+rightR+root.val);
        return Math.max(leftR,rightR)+root.val;
    }
}

public class MaximumPathSum{
public static void main(String[] args){
       TreeNode root=new TreeNode(-10);
       root.left=new TreeNode(9);
       root.right=new TreeNode(20);
       root.right.right=new TreeNode(13);
        root.right.left=new TreeNode(5);
        Solution s=new Solution();
        System.out.print(s.ans(root));


    }
}