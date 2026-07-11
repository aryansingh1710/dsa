class Solution {
    public int maxProduct(int[] a) {
        int n=a.length;
        int i=0;
        int minEnding=a[0];
        int maxEnding=a[0];
        int ans=a[0];
        for (int j=1;j<n;j++){
          int v1=a[j];
          int v2=minEnding*a[j];
          int v3=maxEnding*a[j];
          minEnding=Math.min(Math.min(v2,v3),a[j]);
          maxEnding=Math.max(Math.max(v2,v3),a[j]);
          ans=Math.max(ans,Math.max(minEnding,maxEnding));
        }
        return ans;
    }
}