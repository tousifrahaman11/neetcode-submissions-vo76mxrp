class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j =0;
        int med1 = 0, med2 = 0;
        int n = nums1.length;
        int m = nums2.length;

        for(int c = 0; c < (n+m) / 2 + 1; c++){
            med2 = med1;
            if(i < n && j< m){
                if(nums1[i] > nums2[j]){
                    med1 = nums2[j];
                    j++;
                } else{
                    med1 = nums1[i];
                    i++;
                }
            } else if(i < n){
                med1 = nums1[i];
                i++;
            } else{
                med1 = nums2[j];
                j++;
            }
        }
        if((n+m)%2 == 1){
            return (double) med1;
        } else{
            return (med1+med2)/2.0;
        }
    }
}
