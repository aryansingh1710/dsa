class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;
        int gola_index = -1;

        // Step 1: find breakpoint
        for (int i = n - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                gola_index = i - 1;
                break;
            }
        }

        // Step 2: if breakpoint exists, find next greater element
        if (gola_index != -1) {
            for (int j = n - 1; j > gola_index; j--) {
                if (nums[j] > nums[gola_index]) {
                    swap(nums, gola_index, j);
                    break;
                }
            }
        }

        // Step 3: reverse the suffix
        reverse(nums, gola_index + 1, n - 1);
    }

    // swap function
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // reverse function
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}