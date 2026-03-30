class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] A = nums1;
        int[] B = nums2;
        int tot = A.length+B.length;
        int hf = (tot+1)/2;

        if(B.length < A.length){
            int[] temp = A;
            A = B;
            B = temp;
        }
        int l = 0;
        int r = A.length;
        while(l <= r){
            int i = (l+r)/2;
            int j = hf - i;

            int left = i > 0 ? A[i-1] : Integer.MIN_VALUE;
            int right = i < A.length ? A[i] :Integer.MAX_VALUE;
            int lfB = j > 0 ? B[j-1] : Integer.MIN_VALUE;
            int lfr = j<B.length ? B[j] : Integer.MAX_VALUE;

            if(left <= lfr && lfB <= right){
                if(tot%2 != 0){
                    return Math.max(left, lfB);
                }
                return (Math.max(left, lfB) + Math.min(right, lfr)) / 2.0;
            } else if(left > lfr){
                r = i-1;
            } else{
                l = i+1;
            }
        }
        return -1;
    }
}
