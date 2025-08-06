class Solution {
    int floorSqrt(int n) {
        int low = 1 , high = n;
        int ans = 0;
        while (low<=high){
            int mid = low + (high - low)/2;
            if (mid <= n/mid){
                low = mid +1 ;
                ans = mid;
           }else {
                high  = mid -1 ;
           }
        }
        return high;
    }
}