class Solution {
    public int maxProduct(int[] nums) {
        
        int n = nums.length;
        int leftProduct = 1;
        int rightProduct = 1;
        int ans = nums[0];
        
        for (int i = 0; i < n; i++) {
            
            // reset if product becomes zero
            if (leftProduct == 0) {
                leftProduct = 1;
            }
            
            if (rightProduct == 0) {
                rightProduct = 1;
            }
            
            // prefix product (left to right)
            leftProduct = leftProduct * nums[i];
            
            // suffix product (right to left)
            rightProduct = rightProduct * nums[n - 1 - i];
            
            // update maximum answer
            ans = Math.max(ans, Math.max(leftProduct, rightProduct));
        }
        
        return ans;
    }
}