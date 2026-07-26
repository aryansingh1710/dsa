class Solution {

    public int minEatingSpeed(int[] a, int h) {

        int low = 1;
        int high = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > high) {
                high = a[i];
            }
        }

        int ans = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long hours = calculateHours(a, mid);

            if (hours > h) {
                low = mid + 1;
            } else {
                ans = mid;
                high = mid - 1;
            }
        }

        return ans;
    }

    public long calculateHours(int[] piles, int speed) {

        long hours = 0;

        for (int i = 0; i < piles.length; i++) {

            hours += piles[i] / speed;

            if (piles[i] % speed != 0) {
                hours++;
            }
        }

        return hours;
    }
}