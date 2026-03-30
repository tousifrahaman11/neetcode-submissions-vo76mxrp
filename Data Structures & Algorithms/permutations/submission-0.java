class Solution {
    List<List<Integer>> li;
    public List<List<Integer>> permute(int[] nums) {
        li = new ArrayList<>();
        bck(new ArrayList<>(), nums, new boolean[nums.length]);
        return li;
    }
    void bck(List<Integer> perm, int[] nums, boolean[] pick){
        if(perm.size() == nums.length){
            li.add(new ArrayList<>(perm));
            return;
        }
        for(int i = 0; i<nums.length; i++){
            if(!pick[i]){
                perm.add(nums[i]);
                pick[i] = true;
                bck(perm, nums, pick);
                perm.remove(perm.size()-1);
                pick[i] = false;
            }
        }
    }
}
