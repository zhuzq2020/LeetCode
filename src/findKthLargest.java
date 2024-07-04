public class findKthLargest {
    public static void findKthLargest(int[] nums, int k) {
        for(int i=nums.length/2-1;i>=0;i--){
            heap(nums,nums.length,i);
        }
        for(int i=nums.length-1;i>0;i--){
            int swap=nums[0];
            nums[0]=nums[i];
            nums[i]=swap;
            heap(nums,i,0);
        }
    }
    public static void heap(int[] nums, int boundary, int root){
        int left=root*2+1;
        int right=root*2+2;
        int largest=root;
        if(left<boundary&&nums[left]>nums[root]){
            largest=left;
        }
        if(right<boundary&&nums[right]>nums[largest]){
            largest=right;
        }
        if(largest!=root){
            int swap=nums[root];
            nums[root]=nums[largest];
            nums[largest]=swap;
            heap(nums,boundary,largest);
        }
    }

    public static void main(String[] args) {
        int[] nums={3,2,1,4,4,6,1,2,7,8,11,32,22};
        findKthLargest(nums,0);
        for(Integer i:nums){
            System.out.println(i);
        }
    }
}
