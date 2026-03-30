class Solution {
    List<List<Integer>> li = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        back(0, new ArrayList<>(), nums);
        return li;
    }
    void back(int i, List<Integer> sub, int[] nums){
        li.add(new ArrayList<>(sub));
        for(int j = i; j < nums.length; j++){
            if(j>i && nums[j] == nums[j-1]){
                continue;
            }
            sub.add(nums[j]);
            back(j+1, sub, nums);
            sub.remove(sub.size()-1);
        }
    }
}
