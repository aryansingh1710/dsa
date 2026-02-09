import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        // Step 1: sort the array
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {

            // duplicate i skip
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    // sum == 0 → valid triplet
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    j++;
                    k--;

                    // duplicate j skip
                    while (j < k && nums[j] == nums[j - 1]) j++;

                    // duplicate k skip
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }
        return ans;
    }
}
