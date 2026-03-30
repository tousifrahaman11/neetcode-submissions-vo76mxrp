class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length-1;

        int rot = nums[0];
        while(l<=r){
            if(nums[l]<nums[r]){
                rot = Math.min(rot, nums[l]);
                break;
            }
            int mid = l + (r-l) / 2;
            rot = Math.min(rot, nums[mid]);

            if(nums[mid] >= nums[l]){
                l = mid+1;
            } else{
                r = mid-1;
            }
        }
        return rot;
    }
}
