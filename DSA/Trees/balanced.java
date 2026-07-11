class Solution{
    public int height(TreeNode node){
        if(node==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public boolean isBalanced(TreeNode node){
        if(node==null) return true;
        if((Math.abs(height(root.left)-height(root.right)))>1) return false;    }
        return isBalanced(root.left)&&isBalanced(root.right);
}