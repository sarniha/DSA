import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}
    class Solution{
        public boolean isleaf(TreeNode root){

            return (root.left==null)&&(root.right==null);
        }
        public void addleaves(TreeNode root,List<Integer> res){
            if(isleaf(root)){
                res.add(root.val);
                return;
            }
            if(root.left!=null)
            addleaves(root.left,res);
            if(root.right!=null)
            addleaves(root.right,res);

        }
        public List<Integer> rightBoundary(TreeNode root,List<Integer> res){
            List<Integer> temp=new ArrayList<>();
            TreeNode curr=root;
            curr=curr.right;
            while(curr!=null){
                if(!isleaf(curr)){
                temp.add(curr.val);
                }
                if(curr.right!=null){
                    curr=curr.right;
                }
                else{
                    curr=curr.left;
                }

            }
            for(int i=temp.size()-1;i>=0;--i){
                res.add(temp.get(i));
            }
            return res;
        }
        public List<Integer> leftBoundary(TreeNode root,List<Integer> res){
            TreeNode curr=root;

            
            curr=curr.left;
            while(curr!=null){
                if(!isleaf(curr)){
                res.add(curr.val);
                }
                if(curr.left!=null){
                    curr=curr.left;
                }
                else{
                    curr=curr.right;
                }

            }
            return res;

        }

        
    }
    public class BoundaryTraversal{
        public static void main(String[] args){
            TreeNode node=new TreeNode(1);
            node.left=new TreeNode(2);
            node.left.left=new TreeNode(3);
            node.left.left.right=new TreeNode(4);
            node.left.left.right.left=new TreeNode(5);
            node.left.left.right.right=new TreeNode(6);
            node.right=new TreeNode(7);
            node.right.right=new TreeNode(8);
            node.right.right.left=new TreeNode(9);
            node.right.right.left.right=new TreeNode(10);
            node.right.right.left.left=new TreeNode(11);
            Solution s=new Solution();
            List<Integer> res=new ArrayList<>();
            if(node!=null){

            
            res.add(node.val);
            s.leftBoundary(node,res);
            s.addleaves(node,res);
            s.rightBoundary(node,res);
            }
            for(int i=0;i<res.size();i++)
            System.out.println(res.get(i));


        }
    }
    


