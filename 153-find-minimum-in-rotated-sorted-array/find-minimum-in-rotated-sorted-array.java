class Solution {
    public int findMin(int[] a) {
        int low = 0;
        int high = a.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (a[mid] > a[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return a[low];
    }
}