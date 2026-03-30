class Solution {
    List<List<Integer>> li;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
         li = new ArrayList<>();
         
        List<Integer> curr = new ArrayList<>();
        back(nums, target, curr, 0);
        return li;
    }
    void back(int[] nums, int target, List<Integer> curr, int i){
        if(target == 0){
            li.add(new ArrayList<>(curr));
            return;
        }
        if(target < 0 || i >= nums.length){
            return;
        }
        curr.add(nums[i]);
        back(nums, target-nums[i], curr, i);
        curr.remove(curr.size()-1);
        back(nums, target, curr, i+1);
    }
}
