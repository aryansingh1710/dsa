class Solution {
    
    public int firstOccurrence(int[] a,int x){
           int n=a.length;
           int low=0;
           int high=n-1;
           int ans=-1;
            while(low<=high){
                int guess=low+(high-low)/2;
                if(a[guess]==x){
                    ans=guess;
                    high=guess-1;
                }
                else if(a[guess]<x){
                    low=guess+1;
                }
                else{
                    high=guess-1;
                }
            }
            return ans;
        }

     public int lastOccurrence(int[] a,int x){
           int n=a.length;
           int low=0;
           int high=n-1;
           int ans=-1;
            while(low<=high){
                int guess=low+(high-low)/2;
                if(a[guess]==x){
                    ans=guess;
                    low=guess+1;
                }
                else if(a[guess]<x){
                    low=guess+1;
                }
                else{
                    high=guess-1;
                }
            }
            return ans;
        }


    public int[] searchRange(int[] a, int x) {
       
        int first = firstOccurrence(a, x);
        int last  = lastOccurrence(a, x);

        return new int[]{first, last};
    }
}