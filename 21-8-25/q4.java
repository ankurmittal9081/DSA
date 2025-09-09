class q4{
    public ArrayList<Integer> merge(Node root1,Node root2) {
        ArrayList<Integer> list=new ArrayList<>();
        
        inorder(root1,list);
        inorder(root2,list);
        
        Collections.sort(list); 
        return list;
    }
    private void inorder(Node root,ArrayList<Integer> list) {
        if(root==null){
            return; 
        }
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }
    public static void main(String[] args) {
       
    }
}