class Solution {
    public int search(int[] a, int target) {
        int low=0;
        int high=a.length-1;

        while(low<=high){
            int guess=(low+high)/2;

            if(a[guess]==target){
                return guess;
            }

            else if(a[guess]<target) {low=guess+1;}

            else {high=guess-1;}
        }
        return -1;
    }
}