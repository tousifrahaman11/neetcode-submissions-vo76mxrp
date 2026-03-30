class KthLargest {
    private PriorityQueue<Integer> mh;
    private int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.mh = new PriorityQueue<>();
        for(int num : nums){
            mh.offer(num);
            if(mh.size() > k){
                mh.poll();
            }
        }
    }
    
    public int add(int val) {
        mh.offer(val);
        if(mh.size() > k){
            mh.poll();
        }
        return mh.peek();
    }
}
