class HeapSort {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        for(int i=n/2-1;i>=0;i--) {
            heapify(nums,n,i);
        }  
        while(n>1){
            swap(nums,n-1,0);
            n--;
            heapify(nums,n,0);
        }
        return nums;
    }
   public void swap(int[] nums,int i,int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void heapify(int[] nums,int n,int i){
        int largest=i;
        int left=(2*i)+1;
        int right=(2*i)+2;

        if(left<n && nums[largest]<nums[left]){
            largest=left;
        }
        if(right<n && nums[largest]<nums[right]){
            largest=right;
        }
        if(largest!=i){
            swap(nums,largest,i);
            heapify(nums,n,largest);
        }
    }
    public static void main(String[] args) {
       
    }
}