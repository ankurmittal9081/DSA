class q6{
    int getCount(Node root, int l, int h) {
        if(root==null){
            return 0; 
        }
        int count=0;
        if(root.data>=l && root.data<=h){
            count++;
        }
        count+=getCount(root.left,l,h);
        count+=getCount(root.right,l,h);

        return count;
    }
    public static void main(String[] args) {
       
    }
}