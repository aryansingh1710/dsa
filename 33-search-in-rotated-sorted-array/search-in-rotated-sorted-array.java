class Solution {
    public int search(int[] a, int x) {
      int n=a.length;
      int left=0;
      int right=n-1;

      while(left<=right){
        int mid=left+(right-left)/2;

        if(a[mid]==x){
            return mid;
        }

        if(a[left]<=a[mid]){
            if(a[left]<= x && x <a[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        else{
            if(a[mid]<x && x<=a[right]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
      }
      return -1;
    }
}