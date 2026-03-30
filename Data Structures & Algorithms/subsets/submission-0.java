class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        List<Integer> sb = new ArrayList<>();
        dfs(nums, 0, sb, li);
        return li;
    }
    void dfs(int[] nums, int i, List<Integer> sb , List<List<Integer>> li){
        if(i >= nums.length){
            li.add(new ArrayList<>(sb));
            return;
        }
        sb.add(nums[i]);
        dfs(nums, i+1, sb, li);
        
        sb.remove(sb.size()-1);
        dfs(nums, i+1, sb, li);
    }
}
