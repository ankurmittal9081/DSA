class Solution {
    public boolean checkTree(TreeNode root) {
        
        if(root==null){
            return true;
        }
        int sum=root.left.val+root.right.val;
        if(sum==root.val){
            return true;
        }
        return false;
    }
}