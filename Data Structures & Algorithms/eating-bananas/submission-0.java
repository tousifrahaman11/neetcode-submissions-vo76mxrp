class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int l = 1, r = 0;
        for(int i = 0; i<n; i++){
                r = Math.max(r, piles[i]);
            }

        while(l <= r){
            int mid = l + (r-l) /2;

            int hour = 0;
             for (int i = 0; i < n; i++) {
                hour += (piles[i] + mid - 1) / mid;   // ceiling division
            }
            if(hour <= h){
                r = mid-1;
            } else{
                l = mid+1;
            }
        }
        return l;
    }
}
