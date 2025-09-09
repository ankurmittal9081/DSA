package heap;

public // User function Template for Java

class MergeMaxHeaps {
    public int[] mergeHeaps(int[] a, int[] b, int n, int m) {
         int[] c=new int[m+n];
       int j=0;
        for(int i=0;i<a.length;i++){
            c[j++]=a[i];
        }
        for(int k:b){
            c[j++]=k;
        }
        int o=m+n;
        for(int i=o/2-1;i>=0;i--) {
            heapify(c,o,i);
        }  
        return c;
    }
     public void heapify(int[] c,int o,int i){
        int largest=i;
        int left=(2*i)+1;
        int right=(2*i)+2;
        if(left<o && c[largest]<c[left]){
            largest=left;
        }
        if(right<o && c[largest]<c[right]){
            largest=right;
        }
        if(largest!=i){
            swap(c,largest,i);
            heapify(c,o,largest);
        }
    }
     public void swap(int[] c,int i,int j) {
        int temp=c[i];
        c[i]=c[j];
        c[j]=temp;
    }
    public static void main(String[] args) {
       
    }
} {
    
}
