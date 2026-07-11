class Solution {
    public int maxAbsoluteSum(int[] a) {
        int n = a.length;

        int maxSum = a[0];
        int minSum = a[0];
        int ans = Math.abs(a[0]);

        for (int i = 1; i < n; i++) {
            maxSum = Math.max(maxSum + a[i], a[i]);
            minSum = Math.min(minSum + a[i], a[i]);

            ans = Math.max(ans,
                    Math.max(Math.abs(maxSum), Math.abs(minSum)));
        }

        return ans;
    }
}