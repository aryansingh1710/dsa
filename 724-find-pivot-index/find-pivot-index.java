class Solution {
    public int pivotIndex(int[] a) {
      int n=a.length;
      int left=0;
      int sum=0;
      for(int i=0;i<n;i++){
         sum+=a[i];
      }
      for(int i=0;i<n;i++){
        
        int right=sum-a[i]-left;
        if(right==left){
            return i;
        }
        left+=a[i];
      }
      return -1;
    }
}