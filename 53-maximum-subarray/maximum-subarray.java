class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int i=0;
        int bestEnding=nums[0];
        int ans=nums[0];
        for (int j=1;j<n;j++){
          bestEnding=Math.max(bestEnding+nums[j],nums[j]);
          ans=Math.max(ans,bestEnding);
        }
        return ans;
    }
}