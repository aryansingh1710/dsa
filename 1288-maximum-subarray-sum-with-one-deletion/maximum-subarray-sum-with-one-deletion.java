class Solution {
    public int maximumSum(int[] a) {

        int n = a.length;

        int noPow = a[0];
        int pow = 0;
        int res = a[0];

        for (int i = 1; i < n; i++) {

            int newNoPow = Math.max(a[i], noPow + a[i]);
            int newPow = Math.max(pow + a[i], noPow);

            noPow = newNoPow;
            pow = newPow;

            res = Math.max(res, Math.max(noPow, pow));
        }

        return res;
    }
}