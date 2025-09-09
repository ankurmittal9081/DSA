package heap;

public 

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}


class isBinaryTreeheap {
    boolean isHeap(Node tree) {
        // code here
        int total=total(tree);
        if(isComplete(tree,0,total) && isMax(tree)){
            return true;
        }
        else{
            return false;
        }
    }
    int total(Node tree){
        if(tree==null){
            return 0;
        }
        int ans=1+total(tree.left)+total(tree.right);
        return ans;
    }
    boolean isComplete(Node tree,int i,int total){
        if(tree==null){
            return true;
        }
        else{
            if(i>=total){
                return false;
            }
            else{
                boolean left=isComplete(tree.left,2*i+1,total);
                boolean right=isComplete(tree.right,2*i+2,total);
                return left&&right;
            }
        }
    }
    boolean isMax(Node tree){
        if(tree==null){
            return true;
        }
        if(tree.left==null && tree.right==null){
            return true;
        }
        if(tree.left==null){
            return (tree.data >= tree.right.data) && isMax(tree.right);
        }
        if(tree.right==null){
              return (tree.data >= tree.left.data) && isMax(tree.left);
        }
        return (tree.data>=tree.right.data && tree.data>=tree.left.data) && isMax(tree.left) && isMax(tree.right);
    }
    public static void main(String[] args) {
       
    }
} {
    
}
