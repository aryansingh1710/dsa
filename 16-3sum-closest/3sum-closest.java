import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int n = nums.length;

        // Initial closest sum
        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < n - 2; i++) {

            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                // Update closest sum
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }

                // Exact match
                if (sum == target) {
                    return sum;
                }
                // Need a larger sum
                else if (sum < target) {
                    j++;
                }
                // Need a smaller sum
                else {
                    k--;
                }
            }
        }

        return closestSum;
    }
}