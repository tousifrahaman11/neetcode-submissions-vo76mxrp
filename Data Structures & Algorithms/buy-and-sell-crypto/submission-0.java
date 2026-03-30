class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int mxp = 0;
        int n = prices.length;

        while(r < n){
            if(prices[r] > prices[l]){
                int pr = prices[r] - prices[l];
                mxp = Math.max(mxp, pr);
            } else{
                l = r;
            }
            r++;
        }
        return mxp;
    }
}
