class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<int[]> hp = new PriorityQueue<>((a,b) -> b[0] - a[0]);
        int[] op = new int[nums.length-k+1];
        int idx = 0;
        for(int i = 0; i<nums.length; i++){
            hp.offer(new int[]{nums[i], i});
            if(i >= k-1){
                while(hp.peek()[1] <= i-k){
                    hp.poll();
                }
                op[idx++] = hp.peek()[0];
            }
        }
        return op;
    }
}
