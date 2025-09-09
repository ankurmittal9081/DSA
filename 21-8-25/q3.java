class q3{ 
    int result=0;
    int count=0;
    public int kthSmallest(TreeNode root, int k) {   
       helper(root,k);
       return result;
    }
    public void helper(TreeNode root,int k){
        if(root==null){
            return ;
        }
        helper(root.left,k);
        count++;
        if(count==k){
           result=root.val;
           return;
        }
        helper(root.right,k);  
    }
    public static void main(String[] args) {
       
    }
}