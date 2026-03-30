class KthLargest {
    List<Integer> li;
    int n;
    public KthLargest(int k, int[] nums) {
        n = k;
        li = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            li.add(nums[i]);
        }
    }
    
    public int add(int val) {
        li.add(val);
        Collections.sort(li);
        return li.get(li.size()-n);
    }
}
