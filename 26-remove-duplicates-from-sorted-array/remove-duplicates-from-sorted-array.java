class Solution {
    public int removeDuplicates(int[] nums) {
        int off=0,
            cm=1,
            n=nums.length;
        
        while(cm<n){
            if(nums[off]==nums[cm]){
                cm++;
            }
            else{
                off++;
                nums[off]=nums[cm];
                cm++;
            }
        }
        return off+1;
        
    }
}